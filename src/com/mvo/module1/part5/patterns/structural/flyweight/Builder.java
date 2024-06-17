package src.com.mvo.module1.part5.patterns.structural.flyweight;

public class Builder implements Worker {
    String specialization;

    public Builder(String specialization) {
        this.specialization = specialization;
        System.out.println("A new builder has been created");
    }

    @Override
    public void work() {
        System.out.println("I'm building");
    }
}
