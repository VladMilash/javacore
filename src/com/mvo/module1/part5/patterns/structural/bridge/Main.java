package src.com.mvo.module1.part5.patterns.structural.bridge;

public class Main {
    public static void main(String[] args) {
        Phone samsung = new Samsung(new Android(),new MusicApp());
        samsung.run();
        samsung.openApp();

        Phone iphone = new IPhone(new IOS(), new EmailApp());
        iphone.run();
        iphone.openApp();
    }
}
