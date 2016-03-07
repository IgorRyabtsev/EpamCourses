package com.javaseig.mod2.task2;

import java.util.ArrayList;

/**
 * Created by igor on 07.03.16.
 */
public class Employee {
    private ArrayList<Stationery> its;
    private final String name;
    private String position;


    public Employee(String name, String position) {
        this.name = name;
        this.position = position;
        its= new ArrayList<>();
    }

    public Employee printItems() {
        for (Stationery s:its) {
            System.out.println(s.toString());
        }
        return this;
    }

    public Employee addItem(Stationery item) {
        int i;
        if ((i = its.indexOf(item)) >= 0) {
            its.get(i).add(item.getCount());
        } else {
            its.add(item);
        }
        return this;
    }

    public double getSumPrice() {
        double price=0;
        for (Stationery s:its) {
            price+=s.allCost();
        }
        return price;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (its != null ? !its.equals(employee.its) : employee.its != null) return false;
        if (name != null ? !name.equals(employee.name) : employee.name != null) return false;
        return position != null ? position.equals(employee.position) : employee.position == null;

    }

    @Override
    public int hashCode() {
        int result = its != null ? its.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (position != null ? position.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "its=" + its +
                ", name='" + name + '\'' +
                ", position='" + position + '\'' +
                '}';
    }
}
