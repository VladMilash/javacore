package src.com.mvo.module1.part5.patterns.structural.decorator;

public class Foreman extends WorkerDecorator {
    public Foreman(Worker worker) {
        super(worker);
    }

    @Override
    public void work() {
        super.work();
        System.out.println("Sending a report for the day");
    }
}
