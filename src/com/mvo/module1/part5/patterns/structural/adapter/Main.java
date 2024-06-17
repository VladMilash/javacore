package src.com.mvo.module1.part5.patterns.structural.adapter;

public class Main {
    public static void main(String[] args) {
        FileReader fileReader = new PdfFileReaderAdapter();
        fileReader.read();
    }
}
