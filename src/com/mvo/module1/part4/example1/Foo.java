package src.com.mvo.module1.part4.example1;

import java.util.concurrent.CountDownLatch;

public class Foo {
    private final CountDownLatch cdl1 = new CountDownLatch(1);
    private final CountDownLatch cdl2 = new CountDownLatch(1);


    public void first() {
        System.out.print("first");
        cdl1.countDown();
    }

    public void second() {
        try {
            cdl1.await();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.print("second");
        cdl2.countDown();
    }

    public void third() {
        try {
            cdl2.await();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.print("third");
    }

}
