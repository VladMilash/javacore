package src.com.mvo.module1.part5.patterns.creational.abstractfactory.wooden;

import src.com.mvo.module1.part5.patterns.creational.abstractfactory.SpoonsCreator;

public class WoodenSpoonsCreator implements SpoonsCreator {
    @Override
    public void createSpoon() {
        System.out.println("A wooden spoon has been created");
    }
}
