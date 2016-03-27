package com.javaseig.mod5.task1;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * Created by igor on 27.03.16.
 */
public class Main {
    public static void main(String[] args) {
        Path file = Paths.get("/home");
        Terminal t = new Terminal(file);
        boolean working = true;
        String input;
        t.helpUser();
        try (Scanner scanner = new Scanner(System.in)) {
            while (working) {
                input = scanner.next();
                switch (input) {
                    case "cat":
                        input = scanner.next();
                        t.cat(input);
                        break;
                    case "ls":
                        t.ls();
                        break;
                    case "cd":
                        input = scanner.next();
                        t.cd(input);
                        break;
                    case "nano":
                        input = scanner.next();
                        System.out.println("Write the message, to stop use !stop ");
                        StringBuilder sb = new StringBuilder();
                        while (!scanner.hasNext(Pattern.compile("!stop"))) {
                            sb.append(scanner.nextLine()).append("\n");
                        }
                        t.add(input, sb.toString());
                        break;
                    case "create":
                        input = scanner.next();
                        t.createFile(input);
                        break;
                    case "delete":
                        input = scanner.next();
                        t.delete(input);
                        break;
                    case "help":
                        t.helpUser();
                        break;
                    case "exit":
                        working = false;
                        break;
                }
            }
        }
    }
}
