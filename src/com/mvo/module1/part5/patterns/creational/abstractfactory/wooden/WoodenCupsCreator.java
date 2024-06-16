package src.com.mvo.module1.part5.patterns.creational.abstractfactory.wooden;

import src.com.mvo.module1.part5.patterns.creational.abstractfactory.CupsCreator;

public class WoodenCupsCreator implements CupsCreator {
    @Override
    public void createCup() {
        System.out.println("A wooden cup has been created");
    }
}
