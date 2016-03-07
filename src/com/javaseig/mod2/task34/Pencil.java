package com.javaseig.mod2.task34;

/**
 * Created by igor on 08.03.16.
 */
public class Pencil extends WritItems{
    private final double rigidity;

    public Pencil(String firm, double price, String color, double rigidity) {
        super(firm, price, color);
        this.rigidity = rigidity;
    }

    public double getRigidity() {
        return rigidity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pencil pencil = (Pencil) o;

        return Double.compare(pencil.rigidity, rigidity) == 0;

    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(rigidity);
        return (int) (temp ^ (temp >>> 32));
    }

    @Override
    public String toString() {
        return "Pencil{" +
                "rigidity=" + rigidity + "\n" +
                super.toString()+
                '}';
    }
}
