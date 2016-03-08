package tests.com.javaseig.mod2.task5;

import com.javaseig.mod2.task5.Groups;
import com.javaseig.mod2.task5.Student;
import com.javaseig.mod2.task5.Subject;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * Created by igor on 08.03.16.
 */
public class GroupsTest {

    @Test
    public void addingStud() {
        Student s1 = new Student("Masha");
        Student s2 = new Student("Petya");
        Student s3 = new Student("Lyonya");

        Groups g = new Groups();

        g.addStudent(Subject.MATH,s1);
        g.addStudentMark(Subject.MATH,s2,4);
        g.addStudentMark(Subject.PROGRAMMING,s3,2.5);
        g.addStudentMark(Subject.MATH,s2,5);

        assertTrue(g.findStudent(s1).get(Subject.MATH).size()==0 && (g.findStudent(s2).get(Subject.MATH).size()==2
                && g.findStudent(s2).get(Subject.MATH).get(0).equals(4) && g.findStudent(s2).get(Subject.MATH).get(1).equals(5))
                && (g.findStudent(s3).get(Subject.PROGRAMMING).size()==1
                && g.findStudent(s3).get(Subject.PROGRAMMING).get(0).equals(2.5)) );


    }
    @Test
    public void studentIn2Groups() {
        Student s2 = new Student("Petya");

        Groups g = new Groups();

        g.addStudentMark(Subject.MATH,s2,4);
        g.addStudentMark(Subject.PROGRAMMING,s2,2.5);
        Map<Subject,ArrayList<Number>> fstud = g.findStudent(s2);
        assertTrue(fstud.size()==2 && fstud.get(Subject.MATH).size()==1 && fstud.get(Subject.MATH).get(0).equals(4)
                    && fstud.get(Subject.PROGRAMMING).size()==1 && fstud.get(Subject.PROGRAMMING).get(0).equals(2.5));
    }

}