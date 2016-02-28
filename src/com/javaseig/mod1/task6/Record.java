package com.javaseig.mod1.task6;

/**
 * Class record for notebook
 * @author IgorRyabtsev
 */

public class Record {

    private String title;
    private String text;

    /**
     * Constructs a new Record with fields title and text
     *
     * @param title record's title
     * @param text record's text
     */
    public Record(String title, String text) {
        this.title = title;
        this.text = text;
    }

    /**
     *  Sets the field title for your Record
     *
     * @param title the title of your record
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Set the field text for your Record
     *
     * @param text the text of your record
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * Returns the title of the record
     *
     * @return title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Returns the text of the record
     *
     * @return text
     */
    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        return  "title='" + title + '\'' +
                "; text='" + text + '\'' +'\n';
    }
}
