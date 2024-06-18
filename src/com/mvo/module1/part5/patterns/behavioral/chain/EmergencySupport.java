package src.com.mvo.module1.part5.patterns.behavioral.chain;

public class EmergencySupport extends Support {
    public EmergencySupport(int typeOfRequest) {
        super(typeOfRequest);
    }

    @Override
    public void resultOfProcessing() {
        System.out.println("The emergency request has been processed");
    }
}
