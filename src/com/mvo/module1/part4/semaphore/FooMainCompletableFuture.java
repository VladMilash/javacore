package src.com.mvo.module1.part4.semaphore;

import java.util.concurrent.CompletableFuture;

public class FooMainCompletableFuture {
    public static void main(String[] args) {
        Foo foo = new Foo();

        CompletableFuture.runAsync(foo::first);
        CompletableFuture.runAsync(foo::second);
        CompletableFuture.runAsync(foo::third);

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
