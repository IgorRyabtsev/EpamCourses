package com.javaseig.mod2.task34;

/**
 * Created by igor on 08.03.16.
 */
public class Pen extends WritItems{
    private double thickness;

    public Pen(String firm, int price, String color, double thickness) {
        super(firm, price, color);
        this.thickness = thickness;
    }

    public double getThickness() {
        return thickness;
    }

    public void setThickness(double thickness) {
        this.thickness = thickness;
    }

    @Override
    public String toString() {
        return "Pen{" +
                "thickness=" + thickness + "\n" +
                super.toString()+
                '}';
    }
}
