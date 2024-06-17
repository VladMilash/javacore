package src.com.mvo.module1.part5.patterns.structural.decorator;

public class WorkerDecorator implements Worker {
    Worker worker;

    public WorkerDecorator(Worker worker) {
        this.worker = worker;
    }

    @Override
    public void work() {
        worker.work();
    }
}
