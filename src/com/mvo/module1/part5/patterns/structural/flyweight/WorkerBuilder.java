package src.com.mvo.module1.part5.patterns.structural.flyweight;

import java.util.HashMap;

public class WorkerBuilder {
    private  static HashMap <String, Worker> workers = new HashMap<>();
    public Worker getWorker(String specialization) {
        Worker worker = workers.get(specialization);
        if (worker == null) {
            worker = switch (specialization) {
                case "builder" -> new Builder(specialization);
                case "porter" -> new Porter(specialization);
                default -> worker;
            };
            workers.put(specialization, worker);
        }
        return  worker;
    }
}
