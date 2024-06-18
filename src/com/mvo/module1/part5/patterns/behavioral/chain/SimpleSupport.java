package src.com.mvo.module1.part5.patterns.behavioral.chain;

public class SimpleSupport extends Support {

    public SimpleSupport(int typeOfRequest) {
        super(typeOfRequest);
    }

    @Override
    public void resultOfProcessing() {
        System.out.println("A simple request has been processed");
    }
}
