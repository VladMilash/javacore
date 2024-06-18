package src.com.mvo.module1.part5.patterns.behavioral.chain;

public class TechnicalSupport extends Support {

    public TechnicalSupport(int typeOfRequest) {
        super(typeOfRequest);
    }

    @Override
    public void resultOfProcessing() {
        System.out.println("The technical request has been processed");
    }
}
