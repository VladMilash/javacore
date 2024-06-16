package src.com.mvo.module1.part5.patterns.creational.abstractfactory;

import src.com.mvo.module1.part5.patterns.creational.abstractfactory.wooden.WoodenTablewareFactory;

public class ManufactureTableware {

    public static void main(String[] args) {
        TablewareFactory tablewareFactor = new WoodenTablewareFactory();
        CupsCreator cupsCreator = tablewareFactor.createCup();
        PlatesCreator platesCreator = tablewareFactor.createPlate();
        SpoonsCreator spoonsCreator = tablewareFactor.createSpoon();

        cupsCreator.createCup();
        platesCreator.createPlate();
        spoonsCreator.createSpoon();
    }

}
