package src.com.mvo.module1.part5.patterns.creational.factory;

public class MusicalInstrumentStore {
    public static void main(String[] args) {
        OrderFactory orderFactory = orderMusicalInstrument("Drums");
        OrderMusicalInstrument orderMusicalInstrument = orderFactory.createOrder();
        orderMusicalInstrument.collectOrder();
    }

    static OrderFactory orderMusicalInstrument(String musicalInstrument) {
        if (musicalInstrument.equalsIgnoreCase("Guitar")) {
            return new GuitarOrderFactory();
        } else if (musicalInstrument.equalsIgnoreCase("Drums")) {
            return new DrumsOrderFactory();
        } else {
            throw new RuntimeException(musicalInstrument + " there is no such kind of musical instrument in the store");
        }
    }
}
