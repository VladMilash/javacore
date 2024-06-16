package src.com.mvo.module1.part5.patterns.creational.builder;

public class Main {
    public static void main(String[] args) {
        CottageBuilder cottageBuilder = new CottageBuilder();

        Cottage cottage = cottageBuilder
                .buildHouse("House")
                .buildSwing("Swing")
                .build();

        cottage.cottageComposition();

    }
}
