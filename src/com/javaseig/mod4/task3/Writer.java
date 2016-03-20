package com.javaseig.mod4.task3;

import jdk.internal.util.xml.impl.ReaderUTF8;

import java.io.*;

/**
 * Created by igor on 20.03.16.
 */
public class Writer {
    File in;
    File out;
    StringBuilder text;
    public Writer(File in, File out) {
        this.in = in;
        this.out = out;
        text = new StringBuilder();
    }

    void procRead() throws IOException {
        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream(in), "UTF8"))){
            String nextString;
            while ((nextString = br.readLine()) != null) {
                text.append(nextString);
                text.append(" ");
            }
        }
    }
    void procWrite() throws IOException {
        try(BufferedWriter bw = new BufferedWriter
                (new OutputStreamWriter(new FileOutputStream(out),"UTF16"))) {
            bw.write(text.toString());
        }
    }
}
