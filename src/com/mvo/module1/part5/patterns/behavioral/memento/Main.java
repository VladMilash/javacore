package src.com.mvo.module1.part5.patterns.behavioral.memento;

public class Main {
    public static void main(String[] args) {
        Notion notion = new Notion();
        HistoryNotion historyNotion = new HistoryNotion();

        System.out.println("Made new note");
        notion.setNotAndDate("Some note...");
        System.out.println("Save note");
        historyNotion.setSave(notion.save());
        System.out.println("Update note");
        notion.setNotAndDate("Some new note...");
        System.out.println(notion);
        System.out.println("Rolling back");
        notion.load(historyNotion.getSave());
        System.out.println("Note after rolling back");
        System.out.println(notion);
    }
}
