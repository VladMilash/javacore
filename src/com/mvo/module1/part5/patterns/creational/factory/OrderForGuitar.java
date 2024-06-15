package src.com.mvo.module1.part5.patterns.creational.factory;

public class OrderForGuitar implements OrderMusicalInstrument {
    @Override
    public void collectOrder() {
        System.out.println("A request for a guitar warehouse has been poisoned");
    }
}
