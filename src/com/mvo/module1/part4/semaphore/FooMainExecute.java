package src.com.mvo.module1.part4.semaphore;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FooMainExecute {
    public static void main(String[] args) {
        Foo foo = new Foo();

        ExecutorService executor = Executors.newFixedThreadPool(3);

        executor.execute(foo::first);
        executor.execute(foo::second);
        executor.execute(foo::third);

        executor.shutdown();
    }
}
