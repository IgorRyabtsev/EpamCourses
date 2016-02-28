package com.javaseig.mod1.task4;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by igor on 28.02.16.
 */
public class ArrayMax {

    static double [] numbers;
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int n=0;
        System.out.println("Please write integer size of ur array:");

        try {
            n = s.nextInt();
        } catch (InputMismatchException ex) {
            System.out.println("You must enter integer number > 0!");
            System.exit(0);
        }

        if ( n <= 0 ) {
            System.out.println("You must enter integer number > 0!");
            System.exit(0);
        }

        numbers = new double[n];
        System.out.println("Please write " + n + " values of ur array:");
        inputArray(n);

        double max=numbers[0]+numbers[n-1];
        for (int i=0,j=n-1; j-i >= 0; i++,j--) {
            max = max > (numbers[i]+numbers[j]) ? max : (numbers[i]+numbers[j]);
        }
        System.out.println("Max summ = " + max);
    }

    private static void inputArray(double num) {
        for (int i = 0; i < num; i++) {
            try {
                double number = s.nextDouble();
                numbers[i]=number;
            } catch (InputMismatchException ex) {
                System.out.println("You must write a number!");
                System.exit(0);
            }
        }
    }
}
