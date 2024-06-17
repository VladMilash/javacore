package src.com.mvo.module1.part5.patterns.structural.adapter;

public class TxtFileReader implements FileReader {
    @Override
    public void read() {
        System.out.println("Reading txt file");
    }
}
