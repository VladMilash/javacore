package src.com.mvo.module1.part5.patterns.behavioral.visitor;

public class Code implements WorkElement {
    @Override
    public void doWork(Developer developer) {
        developer.working(this);
    }
}
