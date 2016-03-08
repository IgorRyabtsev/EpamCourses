package com.javaseig.mod2.task5;

import java.util.HashMap;

/**
 * Created by igor on 08.03.16.
 */
public class Main {

    public static void main(String[] args) {
        Student s1 = new Student("Lala");
        Student s2 = new Student("lola");
        Student s3 = new Student("Mark");

        Groups g = new Groups();
        g.addStudentMark(Subject.MATH,s2,4);
        g.addStudentMark(Subject.PROGRAMMING,s2,2.5);
        System.out.println(g.findStudent(s2));




    }


}
