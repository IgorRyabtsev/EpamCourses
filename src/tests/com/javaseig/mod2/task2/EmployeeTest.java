package tests.com.javaseig.mod2.task2;

import com.javaseig.mod2.task2.Employee;
import com.javaseig.mod2.task2.Stationery;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by igor on 07.03.16.
 */
public class EmployeeTest {

    @Test
    public void inspectGetters() {
        Employee e=new Employee("John","manager");
        assertTrue(e.getName()=="John" && e.getPosition()=="manager");
        e.setPosition("director");
        assertTrue(e.getName()=="John" && e.getPosition()=="director");
    }

    @Test
    public void allCost() {
        Employee e=new Employee("John","manager");
        Stationery s=new Stationery("S",100,1);
        e.addItem(s);
        Stationery ss=new Stationery("M",50,5);
        e.addItem(ss);
        e.addItem(ss);
        assertTrue(e.getSumPrice()==600);
    }

    @Test
    public void equalAndHashCode() {
        Employee e=new Employee("John","manager");
        Stationery s=new Stationery("S",100,1);
        e.addItem(s);
        Employee ee=new Employee("John","manager");
        Stationery ss=new Stationery("S",100,1);
        ee.addItem(ss);

        assertTrue(e.equals(ee) && e.hashCode()==ee.hashCode());
    }


}