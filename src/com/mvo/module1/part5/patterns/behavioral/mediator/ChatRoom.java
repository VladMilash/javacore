package src.com.mvo.module1.part5.patterns.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatRoom implements Mediator {
    private List<Colleague> colleagues;

    public ChatRoom() {
        colleagues = new ArrayList<>();
    }

    public void addColleague(Colleague colleague) {
        colleagues.add(colleague);
    }

    @Override
    public void sendMessage(String message, Colleague originator) {
        for (Colleague colleague : colleagues) {
            if (colleague != originator) {
                colleague.receiveMessage(message);
            }
        }
    }
}
