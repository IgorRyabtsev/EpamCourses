package com.javaseig.mod2.task2;

/**
 * Created by igor on 07.03.16.
 */
public class Stationery {
    private String firm;
    private double price;
    private int count;

    public Stationery(){}

    public Stationery(String firm, double price, int count) {
        this.firm = firm;
        this.price = price;
        this.count = count;
    }

    public String getFirm() {
        return firm;
    }

    public double getPrice() {
        return price;
    }

    public int getCount() {
        return count;
    }

    public double allCost() {
        return price*count;
    }

    public void add(int n) {
        count += n;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Stationery that = (Stationery) o;

        if (Double.compare(that.price, price) != 0) return false;
        if (Double.compare(that.count, count) != 0) return false;
        return firm != null ? firm.equals(that.firm) : that.firm == null;

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = firm != null ? firm.hashCode() : 0;
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(count);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Stationery{" +
                "firm='" + firm + '\'' +
                ", price=" + price +
                ", count=" + count +
                '}';
    }

}
