package com.javaseig.mod4.task12;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by igor on 20.03.16.
 */
public class Keys {
    public static void main(String[] args) {
        File keys = new File("src/com/javaseig/mod4/task12/javawords");
        File out = new File("src/com/javaseig/mod4/task12/output.txt");
        File out2 = new File("src/com/javaseig/mod4/task12/output2.txt");
        File text = new File("src/com/javaseig/mod4/task12/KeyFind.java");

        try {
            KeyFind kw = new KeyFind(text, keys);
            KeyFind kw2 = new KeyFind(text, keys);
            kw.startProcStreams();
            kw.printStream(out);
            kw2.startProcSyms();
            kw2.printSyms(out2);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
