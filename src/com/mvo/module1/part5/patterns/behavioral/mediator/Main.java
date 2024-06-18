package src.com.mvo.module1.part5.patterns.behavioral.mediator;

public class Main {
    public static void main(String[] args) {
        ChatRoom chatRoom = new ChatRoom();

        User user1 = new User("User 1", chatRoom);
        User user2 = new User("User 2", chatRoom);
        User user3 = new User("User 3", chatRoom);

        chatRoom.addColleague(user1);
        chatRoom.addColleague(user2);
        chatRoom.addColleague(user3);

        user1.sendMessage("Hello, everyone!");
        user2.sendMessage("Hi there!");
    }
}
