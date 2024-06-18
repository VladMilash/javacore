package src.com.mvo.module1.part5.patterns.behavioral.command;

public class Main {
    public static void main(String[] args) {
        Notion notion = new Notion();
        User user = new User(new WriteCommand(notion), new ReadCommand(notion));

        user.doWrite();
        user.doRead();
    }
}
