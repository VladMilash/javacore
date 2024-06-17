package src.com.mvo.module1.part5.patterns.structural.decorator;

public class Builder implements Worker {
    @Override
    public void work() {
        System.out.println("Building");
    }
}
