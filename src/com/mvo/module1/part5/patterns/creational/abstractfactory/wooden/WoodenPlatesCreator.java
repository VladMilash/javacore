package src.com.mvo.module1.part5.patterns.creational.abstractfactory.wooden;

import src.com.mvo.module1.part5.patterns.creational.abstractfactory.PlatesCreator;

public class WoodenPlatesCreator implements PlatesCreator {
    @Override
    public void createPlate() {
        System.out.println("A wooden plate has been created");
    }
}
