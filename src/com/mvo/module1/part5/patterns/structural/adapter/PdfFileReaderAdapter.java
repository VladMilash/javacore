package src.com.mvo.module1.part5.patterns.structural.adapter;

public class PdfFileReaderAdapter extends PdfFileReader implements FileReader {
    @Override
    public void read() {
        readPdf();
    }
}
