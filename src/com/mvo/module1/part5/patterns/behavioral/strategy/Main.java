package src.com.mvo.module1.part5.patterns.behavioral.strategy;

public class Main {
    public static void main(String[] args) {
        Worker worker = new Worker();
        worker.setActivity(new Sleeping());
        worker.doActive();
        worker.setActivity(new Eating());
        worker.doActive();
        worker.setActivity(new Working());
        worker.doActive();
    }
}
