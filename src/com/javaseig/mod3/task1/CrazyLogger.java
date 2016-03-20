package com.javaseig.mod3.task1;

import java.util.Calendar;
import java.util.Formatter;

/**
 * Created by igor on 20.03.16.
 */
public class CrazyLogger {
    StringBuilder log;

    public CrazyLogger() {
        log = new StringBuilder();
    }

    public void addLog(String message) {
        Calendar cal = Calendar.getInstance();
        Formatter form= new Formatter();
        form.format("%td-%tm-%tY:%tH-%tM-%s;\n", cal, cal, cal, cal, cal, message);
        log.append(form);
    }

    public StringBuilder fingLog(String frag) {
        StringBuilder result = new StringBuilder();
        int first = 0;
        int end = 0;
        String tmp;
        while (end < log.length()) {
            end = log.indexOf(";", first)+2;
            tmp = log.substring(first, end);
            first = end;
            if (tmp.contains(frag)) {
                result.append(tmp);
            }
        }
        return result;
    }

    @Override
    public String toString() {
        return "CrazyLogger{" +
                "log=" + log +
                '}';
    }
}
