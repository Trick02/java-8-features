package com.trick02.java8.threads;

public class HowToCreate {
    public static void main(String[] args) {
        //Create a thread using a class that implements runnable
        (new Thread(new HelloRunnable())).start();

        //Create a thread using a class that extends Thread
        (new HelloThread()).start();
        //Create a runnable object
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                //perform some work inside the thread
                System.out.println("Hello from " +
                        Thread.currentThread().getName()
                        + " NOT USING LAMBDA");
            }
        };

        /*Create and start a thread using the first runnable object
         *This thread is also given a name in the arguments */
        Thread t1 = new Thread(r1, "Thread t1");
        t1.start();

        //Create a runnable object using lambda notation
        Runnable r2 = () -> System.out.println("Hello from "
                + Thread.currentThread().getName() + " USING LAMBDA "
                + "notation");

        /*Create and start a second thread using the runnable object with
         *lambda notation and not given a name */
        Thread t2 = new Thread(r2);
        t2.start();
    }
}

    

