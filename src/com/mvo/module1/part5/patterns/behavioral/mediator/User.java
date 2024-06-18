package src.com.mvo.module1.part5.patterns.behavioral.mediator;

public class User extends Colleague {
    private String name;

    public User(String name, Mediator mediator) {
        super(mediator);
        this.name = name;
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println(name + " received message: " + message);
    }
}
