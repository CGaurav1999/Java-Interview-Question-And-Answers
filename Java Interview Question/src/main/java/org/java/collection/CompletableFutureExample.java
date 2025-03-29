package org.java.collection;

import java.util.concurrent.*;

public class CompletableFutureExample {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        // Creating a CompletableFuture
        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(2000); // Simulating delay
            } catch (InterruptedException e) { e.printStackTrace(); }
            return 10;
        });

        System.out.println("Task started. Doing other work...");

        // Non-blocking callback
        future.thenAccept(result -> System.out.println("Result: " + result));

        Thread.sleep(3000); // Ensure main thread doesn't exit early
    }
}
