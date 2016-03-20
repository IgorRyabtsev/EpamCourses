package com.javaseig.mod4.task3;

import java.io.File;
import java.io.IOException;

/**
 * Created by igor on 20.03.16.
 */
public class Execution {
    public static void main(String[] args) {
        File in = new File("src/com/javaseig/mod4/task3/in.txt");
        File out = new File("src/com/javaseig/mod4/task3/out.txt");
        Writer w = new Writer(in,out);
        try {
            w.procRead();
            w.procWrite();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
