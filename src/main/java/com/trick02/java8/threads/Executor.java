package com.trick02.java8.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Executor {

    public static void main(String[] args) {
        //creating a pool of 5 threads  
        ExecutorService executor = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 10; i++) {
            Runnable worker = new WorkerThread("I'm thread " + i);
            //calling execute method of ExecutorService
            executor.execute(worker);
        }
        executor.shutdown();
        while (!executor.isTerminated()) {
        }

        System.out.println("Finished all threads");
    }

}
