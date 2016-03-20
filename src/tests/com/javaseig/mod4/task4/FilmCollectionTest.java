package tests.com.javaseig.mod4.task4;

import com.javaseig.mod4.task4.FilmCollection;
import org.junit.Before;
import org.junit.Test;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

/**
 * Created by igor on 21.03.16.
 */
public class FilmCollectionTest {
    FilmCollection fc;
    @Before
    public void createObject() {
        fc = new FilmCollection();
        Set<String> actors = new HashSet<>();
        actors.add("Leonardo DiCaprio");
        actors.add("Victor Garber");
        fc.addFilm("Titanic",actors);
        actors = new HashSet<>();
        actors.add("Tom Hanks");
        actors.add("David Morse");
        fc.addFilm("The Green Mile",actors);
        actors = new HashSet<>();
        actors.add("Leonardo DiCaprio");
        actors.add("Tom Hardy");
        fc.addFilm("TThe Revenant",actors);
        File file = new File("src/com/javaseig/mod4/task4/serialized");
        try (FileOutputStream fileOutputStream = new FileOutputStream(file);
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
            objectOutputStream.writeObject(fc);
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(1);
        }
    }

    @Test
    public void deserializeAndCheck() {
        File file = new File("src/com/javaseig/mod4/task4/serialized");
        FilmCollection fc1 = new FilmCollection();
        try (FileInputStream fileInputStream = new FileInputStream(file);
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
            fc1 = (FilmCollection) objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            fail();
        }
        assertTrue(fc.equals(fc1));
    }

    //add and delete example
    @Test
    public void changeFilms() {
        //deserialize object
        File file = new File("src/com/javaseig/mod4/task4/serialized");
        FilmCollection fc1 = new FilmCollection();
        try (FileInputStream fileInputStream = new FileInputStream(file);
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
            fc1 = (FilmCollection) objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            fail();
        }
        assertTrue(fc.equals(fc1));
        Set<String> actors = new HashSet<>();
        actors.add("Brad Pitt");
        actors.add("Edward Norton");
        fc1.addFilm("Fight Club",actors);
        assertFalse(fc.equals(fc1));

        fc1.delFilm("Fight Club");
        assertTrue(fc.equals(fc1));

        fc1.delFilm("Titanic");
        assertFalse(fc.equals(fc1));

    }
}