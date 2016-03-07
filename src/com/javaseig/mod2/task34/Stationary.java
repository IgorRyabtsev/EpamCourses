package com.javaseig.mod2.task34;

/**
 * Created by igor on 08.03.16.
 */
public class Stationary implements Comparable<Stationary> {
    private final String firm;
    private double price;

    public Stationary(String firm, double price) {
        this.firm = firm;
        this.price = price;
    }

    public String getFirm() {
        return firm;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public int compareTo(Stationary o) {
        int result = Double.compare(price,o.getPrice());
        return result;
    }

    @Override
    public String toString() {
        return "Stationary{" +
                "firm='" + firm + '\'' +
                ", price=" + price +
                '}';
    }
}
