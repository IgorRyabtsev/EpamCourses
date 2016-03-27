package com.javaseig.mod5.task1;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by igor on 27.03.16.
 */

public class Terminal {
    Path path;
    Path cur;
    public Terminal(Path path) {
        this.path = path.normalize();
    }

    public void cat(String path) {
        createCur(path);
        if (!Files.isDirectory(cur) && Files.exists(cur) && Files.isReadable(cur)) {
            Nano.show(cur);
        } else {
            System.out.println("No such File");
        }
    }

    public void ls() {
        try (DirectoryStream<Path> directoryStream = Files.newDirectoryStream(path)) {
            for (Path entry : directoryStream) {
                System.out.println(entry.getFileName());
            }
        } catch (IOException e) {
            throw new RuntimeException("No such directory",e);
        }
    }


    public void cd(String dest) {
        createCur(dest);
        if (Files.isDirectory(cur) && Files.exists(cur)) {
            path = cur.normalize();
        } else {
            System.out.println("No such directory");
        }
    }

    public void add(String file, String message) {
        createCur(file);
        if (!Files.isDirectory(cur) && Files.exists(cur) && Files.isReadable(cur)) {
            Nano.addText(cur.toString(), message);
            System.out.println("Information added to "+file);
        } else {
            System.out.println("No such File");
        }
    }

    public void createFile(String input) {
        createCur(input);
        if(Files.exists(cur)){
            System.out.println("File already exists!");
            return;
        }
        try {
            Files.createFile(cur);
            System.out.println("File "+input+" created.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void delete(String input) {
        createCur(input);
        if (!Files.isDirectory(cur) && Files.exists(cur) && Files.isReadable(cur)) {
            try {
                Files.delete(cur);
            } catch (IOException e) {
                throw new RuntimeException("No such directory",e);
            }
            System.out.println("File "+input+" deleted.");
        } else {
            System.out.println("No such File");
        }
    }


    private void createCur(String dest) {
        cur = Paths.get(path.toString());
        cur = cur.resolve(Paths.get(dest).normalize()).normalize();
    }

    public void helpUser() {
        System.out.println("" +
                "Use \"ls\" to look throw the directories and files \n" +
                "\"cd <path>\" to go into <path> \n" +
                "\"create <filename>\" to create file <filename> \n" +
                "\"delete <filename>\" to delete file <filename> \n" +
                "\"cat <filename>\" to view content of file <filename> \n" +
                "\"nano <filename>\" to add some information in file <filename>\n" +
                "\"help\" to show help menu\n" +
                "\"exit\" to exit from terminal");
    }
}
