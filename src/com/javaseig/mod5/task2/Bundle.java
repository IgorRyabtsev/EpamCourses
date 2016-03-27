package com.javaseig.mod5.task2;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by igor on 27.03.16.
 */

//key =: value

public class Bundle {
    String path;
    Map<String, String> infos;
    List<String> lines;
    List<String> comments;

    public Bundle(String s) {
        infos = new HashMap<>();
        lines = new ArrayList<>();
        comments = new ArrayList<>();
        path = s;
    }

    public void getBundle() {
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line;
            lines = new ArrayList<>();

            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
        }catch (IOException e) {
            throw new RuntimeException("You dont have such file",e);
        }

        takeInfo();
    }

    private void takeInfo(){
        for (String str : lines) {
            if (str.trim().charAt(0)=='#' || str.trim().charAt(0)=='!') {
                comments.add(str);
                continue;
            }
            String strtrim = str.trim();
            //start parsing

            int i =strtrim.indexOf("=");
            if( i != -1 && strtrim.charAt(i-1)!='\\'){
                infos.put(strtrim.substring(0,i).trim(),strtrim.substring(i+1,strtrim.length()).trim());
                continue;
            }

            i = strtrim.indexOf(":");
            if( i != -1 && strtrim.charAt(i-1)!='\\' ) {
                infos.put(strtrim.substring(0,i-1).trim(),strtrim.substring(i+1,strtrim.length()).trim());
            }
        }

        //delete meta smbols \
        for (Map.Entry<String,String> mp:infos.entrySet()) {
            String strkey = mp.getKey();
            String strval = mp.getValue();
            String s = strval.replaceAll("\\\\=", "=");
            s = s.replaceAll("\\\\:", ":");
            infos.put(strkey,s);
        }
    }

    public String getValue(String key) {
        String value = infos.get(key);
        if ( value != null ) {
            return value;
        }
        throw new RuntimeException("No such key");
    }

    public List<String> getListComments() {
        return comments;
    }

}
