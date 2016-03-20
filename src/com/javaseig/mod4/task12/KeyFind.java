package com.javaseig.mod4.task12;

import java.io.*;
import java.util.Objects;

/**
 * Created by igor on 20.03.16.
 */
public class KeyFind {

    File keys;
    File file;
    KeyWords keyWords;
    public KeyFind(File file, File keys) throws IOException {
        this.file = file;
        this.keys = keys;
        keyWords = new KeyWords(keys);
    }

    public void startProcStreams() throws IOException {
        try (InputStream inputStream = new FileInputStream(file);
             BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream)) {

            int c;
            String tmp = "";
            while (true) {
                c = bufferedInputStream.read();
                if (c == -1) {
                    keyWords.findWord(tmp);
                    break;
                }
                if (isLetter(c)) {
                    tmp += (char) c;
                } else {
                    if (!Objects.equals(tmp, "")) {
                        keyWords.findWord(tmp);
                        tmp = "";
                    }
                }
            }
        }
    }

    public void startProcSyms() throws IOException {
        try (Reader input = new FileReader(file);
             BufferedReader br = new BufferedReader(input)) {
            int c;
            String tmp = "";
            while (true) {
                c = br.read();
                if (c == -1) {
                    keyWords.findWord(tmp);
                    break;
                }
                if (isLetter(c)) {
                    tmp += (char) c;
                } else {
                    if (!Objects.equals(tmp, "")) {
                        keyWords.findWord(tmp);
                        tmp = "";
                    }
                }
            }
        }
    }

    public boolean isLetter(int c) {
        return ((c >= 'a')&&(c <= 'z')) || ((c >= 'A')&&(c <= 'Z'));
    }

    public void printStream(File fout) throws IOException {
        try (OutputStream outputStream = new FileOutputStream(fout);
             BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream)) {

            byte[] b = keyWords.printUses().getBytes();
            bufferedOutputStream.write(b, 0, b.length);
        }
    }

    public void printSyms(File fout) throws IOException {
        try (Writer writer = new FileWriter(fout);
             BufferedWriter bufferedWriter = new BufferedWriter(writer)) {
            char[] b = keyWords.printUses().toCharArray();
            bufferedWriter.write(b, 0, b.length);
        }
    }


}
