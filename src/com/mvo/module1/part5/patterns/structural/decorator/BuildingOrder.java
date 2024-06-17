package src.com.mvo.module1.part5.patterns.structural.decorator;

public class BuildingOrder {
    public static void main(String[] args) {
        Worker worker1 = new Builder();
        Worker worker2 = new Foreman(new Builder());

        worker1.work();
        worker2.work();
    }
}
