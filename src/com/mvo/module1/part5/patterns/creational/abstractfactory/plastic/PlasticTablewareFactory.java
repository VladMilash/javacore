package src.com.mvo.module1.part5.patterns.creational.abstractfactory.plastic;

import src.com.mvo.module1.part5.patterns.creational.abstractfactory.CupsCreator;
import src.com.mvo.module1.part5.patterns.creational.abstractfactory.PlatesCreator;
import src.com.mvo.module1.part5.patterns.creational.abstractfactory.SpoonsCreator;
import src.com.mvo.module1.part5.patterns.creational.abstractfactory.TablewareFactory;

public class PlasticTablewareFactory implements TablewareFactory {
    @Override
    public CupsCreator createCup() {
        return new PlasticCupsCreator();
    }

    @Override
    public PlatesCreator createPlate() {
        return new PlasticPlatesCreator();
    }

    @Override
    public SpoonsCreator createSpoon() {
        return new PlasticSpoonsCreator();
    }
}
