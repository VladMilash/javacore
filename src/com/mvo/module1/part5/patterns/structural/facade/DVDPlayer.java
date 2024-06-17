package src.com.mvo.module1.part5.patterns.structural.facade;

public class DVDPlayer {
    public void on() {
        System.out.println("DVD Player is ON");
    }

    public void play(String movie) {
        System.out.println("Playing movie: " + movie);
    }

    public void stop() {
        System.out.println("DVD Player is STOPPED");
    }

    public void off() {
        System.out.println("DVD Player is OFF");
    }
}
