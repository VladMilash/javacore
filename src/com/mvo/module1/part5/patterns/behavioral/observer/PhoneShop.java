package src.com.mvo.module1.part5.patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class PhoneShop implements Observed {
    public List<String> phoneModels = new ArrayList<>();
    public List<Observer> subscribers = new ArrayList<>();

    public void addModels(String model) {
        this.phoneModels.add(model);
    }

    public void removeModels(String model) {
        this.phoneModels.remove(model);
    }

    @Override
    public void addObserver(Observer observer) {
        this.subscribers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.subscribers.remove(observer);

    }

    @Override
    public void notifyObservers() {
        for (Observer observer : subscribers) {
            observer.handleEvent(phoneModels);
        }
    }
}
