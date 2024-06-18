package src.com.mvo.module1.part5.patterns.behavioral.command;

public class User {
    Command write;
    Command read;

    public User(Command write, Command read) {
        this.write = write;
        this.read = read;
    }

    public void doWrite() {
        write.doCommand();
    }

    public void doRead() {
        read.doCommand();
    }
}
