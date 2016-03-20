package com.javaseig.mod4.task4;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by igor on 20.03.16.
 */
public class FilmCollection implements Serializable {
    Map<String, Set<String> > films;

    public FilmCollection() {
        films = new HashMap<>();
    }

    public void addFilm(String name, Set<String> actors) {
        films.put(name,actors);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FilmCollection that = (FilmCollection) o;
        return films != null ? films.equals(that.films) : that.films == null;

    }

    @Override
    public int hashCode() {
        return films != null ? films.hashCode() : 0;
    }

    public void delFilm(String name) {
        if(films.containsKey(name)) {
            films.remove(name);
        }
    }

    @Override
    public String toString() {
        return "FilmCollection{" +
                "films=" + films +
                '}';
    }
}
