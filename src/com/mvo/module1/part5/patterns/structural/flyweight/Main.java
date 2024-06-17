package src.com.mvo.module1.part5.patterns.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        WorkerBuilder workerBuilder = new WorkerBuilder();
        List<Worker> workers = new ArrayList<>();

        workers.add(workerBuilder.getWorker("builder"));
        workers.add(workerBuilder.getWorker("builder"));
        workers.add(workerBuilder.getWorker("builder"));
        workers.add(workerBuilder.getWorker("builder"));
        workers.add(workerBuilder.getWorker("builder"));

        workers.add(workerBuilder.getWorker("porter"));
        workers.add(workerBuilder.getWorker("porter"));
        workers.add(workerBuilder.getWorker("porter"));
        workers.add(workerBuilder.getWorker("porter"));
        workers.add(workerBuilder.getWorker("porter"));

        for(Worker worker : workers) {
            worker.work();
        }
    }
}
