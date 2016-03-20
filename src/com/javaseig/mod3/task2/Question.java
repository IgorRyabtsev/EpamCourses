package com.javaseig.mod3.task2;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Created by igor on 20.03.16.
 */
public class Question {

    private ResourceBundle bundle;

    public Question(Locale l) {
        this.bundle = ResourceBundle.getBundle("com.javaseig.mod3.task2.props.qustion",l);
    }

    public String getValue(String key) {
        return bundle.getString(key);
    }

}
