package src.com.mvo.module1.part5.patterns.behavioral.chain;

public abstract class Support {
    private int typeOfRequest;

    private Support nextSupport;

    public Support(int typeOfRequest) {
        this.typeOfRequest = typeOfRequest;
    }

    public void setNextSupport(Support nextSupport) {
        this.nextSupport = nextSupport;
    }

    public void requestProcessing(int typeOfRequest) {
        if (this.typeOfRequest >= typeOfRequest) {
            resultOfProcessing();
        } else if (nextSupport != null) {
            System.out.println("The request is passed to the next stage");
            nextSupport.requestProcessing(typeOfRequest);
        } else {
            System.out.println("The request cannot be processed");
        }
    }

    public abstract void resultOfProcessing();
}
