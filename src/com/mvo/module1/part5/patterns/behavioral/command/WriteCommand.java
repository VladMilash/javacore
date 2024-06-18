package src.com.mvo.module1.part5.patterns.behavioral.command;

public class WriteCommand implements  Command {
    Notion notion;

    public WriteCommand(Notion notion) {
        this.notion = notion;
    }

    @Override
    public void doCommand() {
        notion.write();
    }
}
