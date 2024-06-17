package src.com.mvo.module1.part5.patterns.structural.сomposite;

public class Main {
    public static void main(String[] args) {
        FileSystemItem file1 = new File("1.txt");
        FileSystemItem file2 = new File("2.txt");
        FileSystemItem file3 = new File("3.txt");

        Folder folder1 = new Folder("Folder1");
        Folder folder2 = new Folder("Folder2");
        Folder folder3 = new Folder("Folder3");

        folder1.add(file1);
        folder2.add(file2);
        folder3.add(file3);
        folder3.add(folder1);
        folder3.add(folder2);

        folder3.display();
    }
}
