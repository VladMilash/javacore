package src.com.mvo.module1.part5.patterns.behavioral.command;

public class ReadCommand implements Command {
    Notion notion;

    public ReadCommand(Notion notion) {
        this.notion = notion;
    }

    @Override
    public void doCommand() {
        notion.read();
    }
}
