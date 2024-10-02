package com.trick02.java8.threads;

public class ThreadJoinExample {

    public static void main(String[] args) {
        TestJoinClass t1 = new TestJoinClass("t1");
        TestJoinClass t2 = new TestJoinClass("t2");
        TestJoinClass t3 = new TestJoinClass("t3");
        t1.start();
        try {
            t1.join();
        } catch (Exception e) {
            System.out.println(e);
        }
        //thread 2 won't start until thread 1 is complete
        t2.start();

        t3.start();
    }

}
