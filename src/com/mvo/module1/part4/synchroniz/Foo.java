package src.com.mvo.module1.part4.synchroniz;

public class Foo {
    private final Object loc = new Object();
    private boolean isFirstDone = false;
    private boolean isSecondDone = false;


    public void first() {
        synchronized (loc) {
            System.out.print("first");
            isFirstDone = true;
            loc.notifyAll();
        }
    }

    public void second() {
        synchronized (loc) {
            while (!isFirstDone) {
                try {
                    loc.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.print("second");
            isSecondDone = true;
            loc.notifyAll();
        }
    }

    public void third() {
        synchronized (loc) {
            while (!isSecondDone) {
                try {
                    loc.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.print("third");
        }
    }
}

