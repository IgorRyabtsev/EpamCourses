package com.javaseig.mod1.task5;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by igor on 28.02.16.
 */
public class ArrayTDim {

    public static void main(String[] args) {
        int size = 0;
        System.out.print("Please enter integer value of matrix size = ");

        try {
            Scanner s = new Scanner(System.in);
            size = s.nextInt();
        } catch (InputMismatchException ex) {
            System.out.println("You must write an integer number!");
            System.exit(0);
        }

        if (size == 0 || size < 0) {
            System.out.println("Empty matrix!");
            return;
        }

        int [][] matrix = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if(i==j || (i+j) == (size-1)){
                    matrix[i][j]=1;
                } else {
                    matrix[i][j]=0;
                }
            }
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }


    }
}
