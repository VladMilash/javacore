package src.com.mvo.module1.part5.patterns.behavioral.state;

public class Main {
    public static void main(String[] args) {
        Activity activity = new Sleeping();
        Worker worker = new Worker();

        worker.setActivity(activity);

        for (int i = 0; i < 12; i++) {
            worker.doActive();
            worker.changeActivity();
        }
    }
}
