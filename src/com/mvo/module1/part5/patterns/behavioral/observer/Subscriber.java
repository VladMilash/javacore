package src.com.mvo.module1.part5.patterns.behavioral.observer;

import src.com.mvo.module1.part5.patterns.behavioral.memento.Save;

import java.util.List;

public class Subscriber implements Observer {
    public String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent(List<String> phoneModels) {
        System.out.println("Hi, " + name + "\nWe have some changes in phone models\n" + phoneModels);
    }
}
