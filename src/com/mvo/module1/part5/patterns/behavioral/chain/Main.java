package src.com.mvo.module1.part5.patterns.behavioral.chain;

public class Main {
    public static void main(String[] args) {
        Support simpleSupport = new SimpleSupport(TypeOfRequest.SIMPLE);
        Support technicalSupport = new TechnicalSupport(TypeOfRequest.TECHNICAL);
        Support emergencySupport = new EmergencySupport(TypeOfRequest.EMERGENCY);

        simpleSupport.setNextSupport(technicalSupport);
        technicalSupport.setNextSupport(emergencySupport);

        simpleSupport.requestProcessing(TypeOfRequest.EMERGENCY);

    }
}
