package com.javaseig.mod2.task1;

/**
 * Created by igor on 07.03.16.
 */

public class Pen {
    private final String firm;
    private String color;
    private double thickness;
    private double price;

    public Pen(String firm, String color, double thickness, double price) {
        this.firm = firm;
        this.color = color;
        this.thickness = thickness;
        this.price = price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setThickness(double thickness) {
        this.thickness = thickness;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getFirm() {

        return firm;
    }

    public String getColor() {
        return color;
    }

    public double getThickness() {
        return thickness;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pen pen = (Pen) o;

        return Double.compare(pen.thickness, thickness) == 0 && Double.compare(pen.price, price) == 0 && (firm != null ? firm.equals(pen.firm) : pen.firm == null && (color != null ? color.equals(pen.color) : pen.color == null));

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = firm != null ? firm.hashCode() : 0;
        result = 31 * result + (color != null ? color.hashCode() : 0);
        temp = Double.doubleToLongBits(thickness);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Pen{" +
                "firm='" + firm + '\'' +
                ", color='" + color + '\'' +
                ", thickness=" + thickness +
                ", price=" + price +
                '}';
    }

}
