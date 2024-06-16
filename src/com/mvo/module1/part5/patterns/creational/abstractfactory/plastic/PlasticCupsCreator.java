package src.com.mvo.module1.part5.patterns.creational.abstractfactory.plastic;

import src.com.mvo.module1.part5.patterns.creational.abstractfactory.CupsCreator;

public class PlasticCupsCreator implements CupsCreator {
    @Override
    public void createCup() {
        System.out.println("A plastic cup has been created");
    }
}
