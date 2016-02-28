package com.javaseig.mod1.task2;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by igor on 28.02.16.
 */

public class Sequence {

    public static void main(String[] args) {
        double E = 0;
        int num;
        boolean notCorrectNumber = true;

        System.out.print("Please enter epsilon value E = ");

        try {
            Scanner s = new Scanner(System.in);
            E = s.nextDouble();
        } catch (InputMismatchException ex) {
            System.out.println("You must write a positive number!");
            System.exit(0);
        }

        if(E==0 || E < 0) {
            System.out.println("You must write a positive number!");
            System.exit(0);
        }

        // Although we can create List, put numbers in this List, and print them after breaking
        for (int i = 1; ; i++) {
            if (seqRes(i) < E) {
                System.out.println("Number= " + i);
                num = i;
                break;
            }
        }

        System.out.println("Values: ");
        for (int i = 0; i < num; i++) {
            System.out.print(seqRes(i)+" ");
        }

    }

    static double seqRes(int n){
        return 1/Math.pow(n+1,2);
    }
}
