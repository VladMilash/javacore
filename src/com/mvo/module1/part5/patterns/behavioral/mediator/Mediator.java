package src.com.mvo.module1.part5.patterns.behavioral.mediator;

public interface Mediator {
    void sendMessage(String message, Colleague colleague);
}
