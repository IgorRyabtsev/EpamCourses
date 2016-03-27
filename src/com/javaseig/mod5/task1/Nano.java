package com.javaseig.mod5.task1;

import java.io.*;
import java.nio.file.Path;

/**
 * Created by igor on 27.03.16.
 */
public class Nano {

    static void addText(String file, String text) {
        try(PrintWriter printWriter = new PrintWriter(new BufferedWriter(new FileWriter(file, true)), true)){
            printWriter.println(text);
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    static void show(Path path) {
        try (BufferedReader reader = new BufferedReader(new FileReader(path.toFile()))) {
            StringBuilder sb = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                sb.append(line);
            }
            System.out.println(sb);
        } catch (IOException e){
            throw new RuntimeException("No such file",e);
        }
    }
}
