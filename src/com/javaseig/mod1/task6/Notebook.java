package com.javaseig.mod1.task6;

import java.util.ArrayList;

/**
 *  Class Notebook contains of array of {@link Record}
 *
 *  <p>The user can add, delete, edit and prints records.</p>
 *
 *  @author IgorRyabtsev
 */
public class Notebook {
    private ArrayList<Record> rec;

    /**
     *  Constructs Notebook with empty list of {@link Record}
     */
    public Notebook() {
        rec = new ArrayList<>();
    }

    /**
     * Allow to find {@link Record} with such title
     * @param title find the record with such title
     * @return object {@link Record} if there is the Record with title = title, else null
     */
    private Record findTitle(String title){
        for (Record r : rec) {
            if (r.getTitle().equals(title)) {
                return r;
            }
        }
        return null;
    }

    /**
     * Edits text of {@link Record} with given title
     * @param title title of record, that we want to edit
     * @param text new text of record
     * @return true if record was edited successfully and false
     * if record with such title does not exist
     */
    public boolean editRec(String title, String text) {
        Record r = findTitle(title);
        if ( r != null) {
            r.setText(text);
            return true;
        }
        return false;
    }

    /**
     * Deletes the {@link Record} with such title
     * @param title title of record to delete
     * @return true if record was deleted successfully and false
     * if record with such title does not exist
     */
    public boolean removeRec(String title) {
        Record r = findTitle(title);
        if ( r != null) {
            rec.remove(r);
            return true;
        }
        return false;
    }

    /**
     *  Adds {@link Record} to Notebook.
     *
     * @param title record`s title
     * @param text  record`s text
     * @return true if record was added successfully and false
     * if record with such title is already existed.
     */
    public boolean addRec(String title, String text) {
        if(findTitle(title) == null) {
            rec.add(new Record(title,text));
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Notebook:\n" + rec;
    }
}
