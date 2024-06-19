package src.com.mvo.module1.part5.patterns.behavioral.strategy;

public class Worker {
    private Activity activity;

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public void doActive() {
        activity.doActive();
    }
}
