package src.com.mvo.module1.part5.patterns.creational.abstractfactory.wooden;

import src.com.mvo.module1.part5.patterns.creational.abstractfactory.CupsCreator;
import src.com.mvo.module1.part5.patterns.creational.abstractfactory.PlatesCreator;
import src.com.mvo.module1.part5.patterns.creational.abstractfactory.SpoonsCreator;
import src.com.mvo.module1.part5.patterns.creational.abstractfactory.TablewareFactory;

public class WoodenTablewareFactory implements TablewareFactory {
    @Override
    public CupsCreator createCup() {
        return new WoodenCupsCreator();
    }

    @Override
    public PlatesCreator createPlate() {
       return new WoodenPlatesCreator();
    }

    @Override
    public SpoonsCreator createSpoon() {
        return new WoodenSpoonsCreator();
    }
}
