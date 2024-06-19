package src.com.mvo.module1.part5.patterns.behavioral.observer;

public class Main {
    public static void main(String[] args) {
        PhonesShop phoneShop = new PhonesShop();
        phoneShop.addModels("Samsung");
        phoneShop.addModels("IPhone");

        Subscriber subscriber1 = new Subscriber("Ivan");
        Subscriber subscriber2 = new Subscriber("Peter");

        phoneShop.addObserver(subscriber1);
        phoneShop.addObserver(subscriber2);

        phoneShop.notifyObservers();

        phoneShop.removeModels("Samsung");

        phoneShop.notifyObservers();


    }
}
