package src.com.mvo.module1.part4.reentrantLockExample;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Foo {
    private final ReentrantLock lock = new ReentrantLock();
    private final Condition signalFromFirstMethod = lock.newCondition();
    private final Condition signalFromSecondMethod = lock.newCondition();


    public void first() {
        lock.lock();
        try {
            System.out.print("first");
            signalFromFirstMethod.signal();
        } finally {
            lock.unlock();
        }
    }

    public void second() {
        lock.lock();
        try {
            signalFromFirstMethod.await();
            System.out.print("second");
            signalFromSecondMethod.signal();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            lock.unlock();
        }
    }

    public void third() {
        lock.lock();
        try {
            signalFromSecondMethod.await();
            System.out.print("third");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            lock.unlock();
        }
    }
}
