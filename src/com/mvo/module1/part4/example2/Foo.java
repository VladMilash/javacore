package src.com.mvo.module1.part4.example2;

import java.util.concurrent.Semaphore;

public class Foo {
    private final Semaphore semaphoreFirst = new Semaphore(1);
    private final Semaphore semaphoreSecond = new Semaphore(0);
    private final Semaphore semaphoreThird = new Semaphore(0);

    public void first() {
        try {
            semaphoreFirst.acquire();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.print("first");
        semaphoreSecond.release();
    }

    public void second() {
        try {
            semaphoreSecond.acquire();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.print("second");
        semaphoreThird.release();

    }

    public void third() {
        try {
            semaphoreThird.acquire();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.print("third");
    }
}
