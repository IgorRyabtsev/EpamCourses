package tests.com.javaseig.mod5.task2;

import com.javaseig.mod5.task2.Bundle;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by igor on 27.03.16.
 */
public class BundleTest {
    String f;
    Bundle b;
    @Before
    public void init() {
        f = "src/com/javaseig/mod5/task2/1"+".properties";
    }
    @Test
    public void findResults() {
        b = new Bundle(f);
        b.getBundle();
        assertTrue(b.getValue("l").equals("45=asdsdasd"));
        assertTrue(b.getValue("sssss").equals("78"));
        assertTrue(b.getValue("m").equals(""));
    }

    @Test(expected=RuntimeException.class)
    public void throwsRuntimeException() {
        String s ="src/com/javaseig/mod5/task2/2"+".properties";
        b = new Bundle(s);
        b.getBundle();
    }

    @Test(expected=RuntimeException.class)
    public void throwsRuntimeExceptionKey() {
        b = new Bundle(f);
        b.getBundle();
        String s = b.getValue("unrealkey");
    }

    @Test
    public void getComments() {
        List<String> comments = new ArrayList<>();
        comments.add("#sadasdas");
        comments.add("!asdfdasa");
        b = new Bundle(f);
        b.getBundle();

        assertTrue(b.getListComments().equals(comments));
    }

}