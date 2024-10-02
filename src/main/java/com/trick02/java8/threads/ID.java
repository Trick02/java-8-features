package com.trick02.java8.threads;

public class ID {
    private static int counter; // initialized to 0 by default

    public static synchronized int getID() {
        return counter++;
    }
}
