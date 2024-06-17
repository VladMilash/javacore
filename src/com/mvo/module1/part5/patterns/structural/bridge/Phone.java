package src.com.mvo.module1.part5.patterns.structural.bridge;

public abstract class Phone {
    protected OperatingSystem os;
    protected Application app;

    public Phone(OperatingSystem os, Application app) {
        this.os = os;
        this.app = app;
    }

    abstract void run();
    abstract void openApp();
}
