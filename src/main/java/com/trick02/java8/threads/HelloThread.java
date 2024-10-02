package com.trick02.java8.threads;

public class HelloThread extends Thread {
    public void run() {
        System.out.println("Hello from " + Thread.currentThread().getName()
                + " created by "
                + "extending Thread class!");
    }


}
