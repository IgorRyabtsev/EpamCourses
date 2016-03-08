package com.javaseig.mod2.task5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by igor on 08.03.16.
 */

public class Group <T extends Number> {
    private Map<Student,ArrayList<T>> studinfo;

    public Group() {
        studinfo = new HashMap<>();
    }

    public Group(Student s) {
        studinfo = new HashMap<>();
        addStudent(s);
    }

    public void addStudent(Student stud) {
        if(studinfo.get(stud) == null) {
            ArrayList<T> marks = new ArrayList<>();
            studinfo.put(stud,marks);
        }
    }

    public void addMarks(Student stud,T mark) {
        if (studinfo.get(stud) == null) {
            ArrayList<T> ar = new ArrayList<>();
            ar.add(mark);
            studinfo.put(stud, ar);
            return;
        }

        ArrayList<T> ar = new ArrayList<>(studinfo.get(stud));
        ar.add(mark);
        studinfo.put(stud,ar);
    }

    public Map<Student, ArrayList<T>> getStudinfo() {
        return studinfo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Group<?> group = (Group<?>) o;

        return studinfo != null ? studinfo.equals(group.studinfo) : group.studinfo == null;

    }

    @Override
    public int hashCode() {
        return studinfo != null ? studinfo.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Group{" +
                "studinfo=" + studinfo +
                '}';
    }
}