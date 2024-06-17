package src.com.mvo.module1.part5.patterns.structural.bridge;

public class EmailApp implements Application {
    @Override
    public void open() {
        System.out.println("Opening Email Application");
    }
}
