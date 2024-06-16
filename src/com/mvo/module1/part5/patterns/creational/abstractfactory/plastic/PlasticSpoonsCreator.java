package src.com.mvo.module1.part5.patterns.creational.abstractfactory.plastic;

import src.com.mvo.module1.part5.patterns.creational.abstractfactory.SpoonsCreator;

public class PlasticSpoonsCreator implements SpoonsCreator {
    @Override
    public void createSpoon() {
        System.out.println("A plastic spoon has been created");
    }
}
