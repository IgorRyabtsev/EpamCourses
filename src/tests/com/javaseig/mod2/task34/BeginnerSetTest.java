package tests.com.javaseig.mod2.task34;

import com.javaseig.mod2.task34.*;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by igor on 08.03.16.
 */
public class BeginnerSetTest {
    @Test
    public void sortPrice() {
        BeginnerSet bs = new BeginnerSet();
        ArrayList<Stationary> st;
        st=bs.sortPrice();
        //now 4 elements inside
        assertTrue(st.get(0).getPrice()<st.get(1).getPrice() && st.get(1).getPrice()<st.get(2).getPrice() && st.get(2).getPrice()<st.get(3).getPrice());
    }

    @Test
    public void sortName() {
        BeginnerSet bs = new BeginnerSet();
        ArrayList<Stationary> st;
        st=bs.sortName();
        //now 4 elements inside
        for (int i = 0; i < st.size()-1; i++) {
            if(st.get(i).getFirm().compareTo(st.get(i+1).getFirm()) > 0) {
                fail("Mistake in comporation");
            }
        }
    }

    @Test
    public void  sortPriceName() {
        BeginnerSet bs = new BeginnerSet();
        ArrayList<Stationary> st;
        st=bs.sortPriceName();
        for (int i = 0; i < st.size()-1; i++) {

            if(st.get(i).getPrice()>st.get(i+1).getPrice()) {
                fail("Mistake in comporation of prices");
            } else if(st.get(i).getPrice()<st.get(i+1).getPrice()) {
            } else if(st.get(i).getPrice()==st.get(i+1).getPrice()){
                    if(st.get(i).getFirm().compareTo(st.get(i+1).getFirm()) > 0) {
                        fail("Mistake in comporation");
                    }
            }
        }
    }

    //example with own array
    @Test
    public void sortOwnArray() {
        ArrayList<Stationary> its;
        its = new ArrayList<Stationary>();
        Marker m = new Marker("FineReader",51.5,"blue","steel");
        its.add(m);
        Pen p = new Pen("Maxriter",40,"blue",0.5);
        its.add(p);
        Pencil pe = new Pencil("Koh-I-Noor",55.5,"black",1);
        its.add(pe);
        Notebook nb = new Notebook("AbdiCo",94,48);
        its.add(nb);
        BeginnerSet b = new BeginnerSet(its);
        ArrayList <Stationary> st=b.sortPrice();
        //now 4 elements inside
        assertTrue(st.get(0).getPrice()<st.get(1).getPrice() && st.get(1).getPrice()<st.get(2).getPrice() && st.get(2).getPrice()<st.get(3).getPrice());


    }
}