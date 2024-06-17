package src.com.mvo.module1.part5.patterns.structural.bridge;

public class IOS implements OperatingSystem {
    @Override
    public void run() {
        System.out.println("Running iOS");
    }
}
