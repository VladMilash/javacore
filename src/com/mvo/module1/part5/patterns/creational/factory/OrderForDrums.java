package src.com.mvo.module1.part5.patterns.creational.factory;

public class OrderForDrums implements OrderMusicalInstrument {
    @Override
    public void collectOrder() {
        System.out.println("A request for a drums warehouse has been poisoned");
    }
}
