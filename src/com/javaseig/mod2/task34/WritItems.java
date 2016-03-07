package com.javaseig.mod2.task34;

/**
 * Created by igor on 08.03.16.
 */
public abstract class WritItems extends Stationary {
    private final String color;

    public WritItems(String firm, double price, String color) {
        super(firm, price);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "WritItems{" +
                "color='" + color + '\'' + "\n" +
                super.toString()+
                '}';
    }
}
