package com.javaseig.mod2.task5;

/**
 * Created by igor on 08.03.16.
 */
public enum Subject {
    PROGRAMMING {
        public Group<Integer> createGroup() {
            return new Group<Integer>();
        }
    },
    MATH {
        public Group<Double> createGroup() {
            return new Group<Double>();
        }
    };
    public abstract <T extends Number> Group<T> createGroup();

}
