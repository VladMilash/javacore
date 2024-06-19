package src.com.mvo.module1.part5.patterns.behavioral.observer;

public interface Observed {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
