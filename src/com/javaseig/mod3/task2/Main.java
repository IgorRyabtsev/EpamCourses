package com.javaseig.mod3.task2;

import java.util.Locale;

/**
 * Created by igor on 20.03.16.
 */
public class Main {
    public static void main(String[] args) {

        Locale locale = new Locale("ru","RU");
        Question question = new Question(locale);
        Answer answer = new Answer(locale);
        for (int i = 1; i <= 3; i++) {
            System.out.println(answer.getValue("" + i));
        }
        System.out.println(question.getValue("q"));
    }
}
