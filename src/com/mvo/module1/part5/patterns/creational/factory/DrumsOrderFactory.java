package src.com.mvo.module1.part5.patterns.creational.factory;

public class DrumsOrderFactory implements OrderFactory {
    @Override
    public OrderMusicalInstrument createOrder() {
        return new OrderForDrums();
    }
}
