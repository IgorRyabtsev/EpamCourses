package com.javaseig.mod4.task12;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Created by igor on 20.03.16.
 */
public class KeyWords {
    Map<String, Integer> words;
    File filename;

    public KeyWords(File filename) throws IOException {
        this.filename = filename;
        words = new HashMap<>();
        try (FileReader fileReader = new FileReader(filename);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String tmp;
            while (true) {
                tmp = bufferedReader.readLine();
                if (tmp == null) {
                    break;
                }
                words.put(tmp, 0);
            }
        }
    }

    public void findWord(String word) {
        if(!Objects.equals(word,"") && words.containsKey(word)) {
            Integer i = words.get(word);
            words.put(word,i+1);
        }
    }

    public void printAll() {
        System.out.println(words);
    }

    public String printUses() {
        StringBuilder sb=new StringBuilder();
        words.entrySet().stream().filter(i -> i.getValue()>0 ).forEach(i ->{
            sb.append(i.getKey());
            sb.append(" ");
            sb.append(i.getValue());
            sb.append('\n');
        });
        return sb.toString();
    }

}
