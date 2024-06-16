package src.com.mvo.module1.part5.patterns.creational.singleton;

public class Main {
    public static void main(String[] args) {
        NotionManager notionManager = NotionManager.getInstance();
        notionManager.addNotion("Заметка 1");
        notionManager.showNotion();

        NotionManager newNotionManager = NotionManager.getInstance();
        newNotionManager.addNotion("Заметка 2");
        newNotionManager.showNotion();
    }
}
