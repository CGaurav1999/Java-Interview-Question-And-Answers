package org.java.collection;

import java.util.concurrent.*;

public class FutureExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newSingleThreadExecutor();

        // Submitting a task
        Future<Integer> future = executor.submit(() -> {
            Thread.sleep(2000); // Simulating delay
            return 10;
        });

        System.out.println("Task submitted. Doing other work...");

        // Blocking call (waits for result)
        System.out.println("Result: " + future.get()); // Blocks until result is available

        executor.shutdown();
    }
}

