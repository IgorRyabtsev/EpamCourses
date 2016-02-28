package com.javaseig.mod1.task3;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by igor on 28.02.16.
 */
public class Function {
    static double a = 0;
    static double b = 0;
    static double h = 0;
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Please enter a:");
        inputParams(1);
        System.out.println("Please enter b:");
        inputParams(2);

        if( a > b ) {
            System.out.println(" a must be less then b!");
            System.exit(0);
        }

        System.out.println("Please enter h:");
        inputParams(3);

        if( h <= 0 ) {
            System.out.println("h must be positive number!");
            System.exit(0);
        }

        System.out.println("x   Result");
        for (double i = a; i <= b; i+=h) {
            System.out.println(i + " | " + funcRes(i));
        }
    }

    private static double funcRes(double x) {
        return (Math.tan(2*x)-3);
    }

    //if argument = 1 we want enter "a", 2 - "b", 3 - "h"
    private static void inputParams(double num) {
        try {
            double number = s.nextDouble();
            if(num==1) {
                a = number;
            } else  if(num==2) {
                b=number;
            } else {
                h=number;
            }
        } catch (InputMismatchException ex) {
            System.out.println("You must write a number!");
            System.exit(0);
        }

    }
}
