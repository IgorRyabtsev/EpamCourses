package com.javaseig.mod1.task6;

import java.util.Scanner;

/**
 * Created by igor on 28.02.16.
 */
public class NoteTest {
    public static void main(String[] args) {
        Notebook nb = new Notebook();
        String title;
        String text;
        String com;
        boolean stop = false;
        System.out.println("use \"add\" to add record, \"del\" to delete record,\n " +
                           "\"print\" to print all records, \"edit\" to edit record,\n"+
                            "\"stop\" to stop using application");
        Scanner s = new Scanner(System.in);
        while (!stop) {
            com = s.next();
            switch (com) {
                case "print" :
                    System.out.println(nb.toString());
                    break;
                case "add" :
                    System.out.print("Write title: ");
                    s.nextLine();
                    title = s.nextLine();
                    System.out.print("Write ur text: ");
                    text = s.nextLine();
                    if (!nb.addRec(title, text)) {
                        System.out.println("In notebook record with such title is already exist!");
                    } else {
                        System.out.println("OK!");
                    }
                    break;
                case "del":
                    System.out.print("Write title: ");
                    s.nextLine();
                    title = s.nextLine();
                    if( nb.removeRec(title) ) {
                        System.out.println("OK!");
                    } else {
                        System.out.println("No record with such title!");
                    }
                    break;
                case "edit":
                    System.out.print("Write title: ");
                    s.nextLine();
                    title = s.nextLine();
                    System.out.print("Write ur text: ");
                    text = s.nextLine();
                    if (!nb.editRec(title, text)) {
                        System.out.println("No record with such title!");
                    } else {
                        System.out.println("OK!");
                    }
                    break;
                case "stop":
                    System.out.println("Thanks for using our service =)");
                    stop = true;
                    break;
            }
        }

    }
}
