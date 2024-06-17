package src.com.mvo.module1.part5.patterns.structural.bridge;

public class Samsung extends Phone {
    public Samsung(OperatingSystem os, Application app) {
        super(os, app);
    }

    @Override
    void run() {
        os.run();
    }

    @Override
    void openApp() {
        app.open();
    }
}
