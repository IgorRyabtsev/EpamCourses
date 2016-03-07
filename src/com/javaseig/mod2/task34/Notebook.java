package com.javaseig.mod2.task34;

/**
 * Created by igor on 08.03.16.
 */
public class Notebook extends Stationary{
    private final int pagescount;

    public Notebook(String firm, double price, int pagescount) {
        super(firm, price);
        this.pagescount = pagescount;
    }

    public int getPagescount() {
        return pagescount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Notebook notebook = (Notebook) o;

        return pagescount == notebook.pagescount;

    }

    @Override
    public int hashCode() {
        return pagescount;
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "pagescount=" + pagescount + '\n'+
                super.toString()+
                "}";
    }
}
