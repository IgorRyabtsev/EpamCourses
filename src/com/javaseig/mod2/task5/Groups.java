package com.javaseig.mod2.task5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by igor on 08.03.16.
 */

public class Groups {
    private Map<Subject,Group<Number>> groups;

    public Groups() {
        groups = new HashMap<>();
        for (Subject s:Subject.values()) {
            groups.put(s,s.createGroup());
        }
    }

    public void addStudent(Subject su, Student st) {
        groups.get(su).addStudent(st);
    }

    @Override
    public String toString() {
        return "Groups{" +
                "groups=" + groups +
                '}';
    }

    public void addStudentMark(Subject su, Student st, Number mark) {
        groups.get(su).addMarks(st,mark);
    }

    public Map<Subject,ArrayList<Number>> findStudent(Student stud) {
        Map<Subject, ArrayList<Number>> ar= new HashMap<>();

        for (Subject s:Subject.values()) {
            Group<Number> gr = groups.get(s);


            if(gr==null) {
                return null;
            }

            Map<Student, ArrayList<Number> > info = gr.getStudinfo();

            if (info == null) {
                continue;
            }

            ArrayList<Number> marks = info.get(stud);
            if (marks == null) {
                continue;
            }
            ar.put(s,marks);
        }
        return ar;
    }
}
