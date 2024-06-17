package src.com.mvo.module1.part5.patterns.structural.facade;

public class Main {
    public static void main(String[] args) {
        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade();
        homeTheaterFacade.watchMovie("Rambo");
        homeTheaterFacade.endMovie();

    }
}
