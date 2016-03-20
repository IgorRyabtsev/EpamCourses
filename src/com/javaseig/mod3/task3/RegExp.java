package com.javaseig.mod3.task3;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by igor on 20.03.16.
 */
public class RegExp {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder();
        File file = new File("src/com/javaseig/mod3/task3/res");
        try (FileInputStream fis = new FileInputStream(file);
             InputStreamReader fr = new InputStreamReader(fis);
             BufferedReader fin = new BufferedReader(fr)) {

            String line;
            while ((line = fin.readLine()) != null) {
                str.append(line + '\n');
            }

            System.out.println("Sentences with links");

            Pattern p = Pattern.compile("[А-Я]([^.!?]*\\(Рис\\. \\d+[^)]*\\))+[^.!?]*[.!?]"); //рисунке

            Matcher m = p.matcher(str);
            while (m.find()) {
                System.out.println(m.group());
            }

            System.out.println("\nOrder of pictures");
            p = Pattern.compile("\\(Рис\\. (\\d+)[^)\\d]*(\\d*)[^)]*\\)");
            m = p.matcher(str);
            int x, max = 0;
            int y=0;
            boolean flag = false;
            while (m.find()) {
                x = Integer.parseInt(m.group(1));
//                System.out.println(x);
                if (!m.group(2).equals("")) {
                    y = Integer.parseInt(m.group(2));
//                    System.out.println(y);
                }
                else {
                    y = Integer.MAX_VALUE;
                }
                if (x < max || x > y) {
                    System.out.println("Error!");
                    flag = true;
                    break;
                }
                else {
                    max = x;
                }
            }
            if (flag == false) {
                System.out.println("ok!!!");
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
