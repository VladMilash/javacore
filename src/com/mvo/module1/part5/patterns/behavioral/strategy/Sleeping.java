package src.com.mvo.module1.part5.patterns.behavioral.strategy;

public class Sleeping implements Activity {
    @Override
    public void doActive() {
        System.out.println("Sleeping...");
    }
}
