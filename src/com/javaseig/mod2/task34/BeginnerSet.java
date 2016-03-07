package com.javaseig.mod2.task34;

import com.javaseig.mod1.task6.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by igor on 08.03.16.
 */
public class BeginnerSet {
    private ArrayList<Stationary> its;

    public BeginnerSet() {
        //набор новичка:
        its = new ArrayList<Stationary>();
        Marker m = new Marker("Max",55.5,"black","paper");
        its.add(m);
        Pen p = new Pen("Pilot",120,"blue",0.7);
        its.add(p);
        Pencil pe = new Pencil("Fine",20,"black",2);
        its.add(pe);
        Notebook nb = new Notebook("Bee",45,96);
        its.add(nb);
    }

    public BeginnerSet(ArrayList<Stationary> its) {
        this.its = its;
    }

    public ArrayList<Stationary> sortPrice() {
        ArrayList<Stationary> it=its;
        Collections.sort(it);
        return it;
    }

    public ArrayList<Stationary> sortName() {
        ArrayList<Stationary> it=its;
        Collections.sort(it,(Stationary f,Stationary s) -> f.getFirm().compareTo(s.getFirm()));
        return it;
    }

    class StationaryComparator implements Comparator<Stationary> {
        @Override
        public int compare(Stationary o1, Stationary o2) {
            int result;
            if ((result = o1.compareTo(o2)) != 0) {
                return result;
            } else {
                return o1.getFirm().compareTo(o2.getFirm());
            }
        }
    }
    public ArrayList<Stationary> sortPriceName() {
        ArrayList<Stationary> ir = its;
        Collections.sort(its, new StationaryComparator());
        return its;
    }



}
