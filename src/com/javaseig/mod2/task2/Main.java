package com.javaseig.mod2.task2;

import static org.junit.Assert.assertTrue;

/**
 * Created by igor on 08.03.16.
 */
public class Main {
    public static void main(String[] args) {
        Employee e=new Employee("John","manager");
        Stationery s=new Stationery("S",1,1);
        e.addItem(s);
        System.out.println(e.getSumPrice());
//        e.addStat("Pilotm",100,2);
    }
}
