package src.com.mvo.module1.part5.patterns.creational.abstractfactory.plastic;

import src.com.mvo.module1.part5.patterns.creational.abstractfactory.PlatesCreator;

public class PlasticPlatesCreator implements PlatesCreator {
    @Override
    public void createPlate() {
        System.out.println("A plastic plate has been created");
    }
}
