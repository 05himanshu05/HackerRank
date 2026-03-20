package applePractice;

import java.util.concurrent.CompletableFuture;


public class CompletableFutureExample {

    public static void main(String[] args) throws Exception {

        CompletableFuture<String> future = CompletableFuture.supplyAsync(()-> "Hello from Async task");

        String result = future.get();  // waits for result
        System.out.println("Testing");
        System.out.println(result);
    }
}
