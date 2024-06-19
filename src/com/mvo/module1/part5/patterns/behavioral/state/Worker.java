package src.com.mvo.module1.part5.patterns.behavioral.state;

public class Worker {
    private Activity activity;

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public void changeActivity() {
        if (activity instanceof Sleeping) {
            setActivity(new Eating());
        } else if (activity instanceof Eating) {
            setActivity(new Working());
        } else if (activity instanceof Working) {
            setActivity(new Sleeping());
        }
    }

    public void doActive() {
        activity.doActive();
    }
}
