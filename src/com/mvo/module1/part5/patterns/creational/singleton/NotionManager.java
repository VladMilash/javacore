package src.com.mvo.module1.part5.patterns.creational.singleton;

public class NotionManager {
    private static NotionManager notionManager;
    private static String notion = "Это файл с заметками. \n";

    private NotionManager() {
    }

    public static synchronized NotionManager getInstance() {
        if (notionManager == null) {
            return new NotionManager();
        }
        return notionManager;
    }

    public void addNotion(String someNotion) {
        notion += someNotion + "\n";
    }

    public void showNotion() {
        System.out.println(notion);
    }


}
