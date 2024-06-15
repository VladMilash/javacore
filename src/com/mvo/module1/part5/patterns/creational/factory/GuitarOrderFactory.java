package src.com.mvo.module1.part5.patterns.creational.factory;

public class GuitarOrderFactory implements OrderFactory{
    @Override
    public OrderMusicalInstrument createOrder() {
        return new OrderForGuitar();
    }
}
