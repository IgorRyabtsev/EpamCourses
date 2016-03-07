package com.javaseig.mod2.task34;

/**
 * Created by igor on 08.03.16.
 */
public class Marker extends WritItems{
    private final String purpose;

    public Marker(String firm, double price, String color, String purpose) {
        super(firm, price, color);
        this.purpose = purpose;
    }

    public String getPurpose() {
        return purpose;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Marker marker = (Marker) o;

        return purpose != null ? purpose.equals(marker.purpose) : marker.purpose == null;

    }

    @Override
    public int hashCode() {
        return purpose != null ? purpose.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Marker{" +
                "purpose='" + purpose + '\'' + "\n"
                + super.toString() +
                "} ";
    }
}
