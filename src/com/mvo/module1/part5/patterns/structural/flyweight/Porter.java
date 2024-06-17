package src.com.mvo.module1.part5.patterns.structural.flyweight;

public class Porter implements Worker {
    String specialization;

    public Porter(String specialization) {
        this.specialization = specialization;
        System.out.println("A new porter has been created");
    }

    @Override
    public void work() {
        System.out.println("I'm carrying");
    }
}
