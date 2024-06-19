package src.com.mvo.module1.part5.patterns.behavioral.visitor;

public class JavaDeveloper implements Developer {
    @Override
    public void working(Code code) {
        System.out.println("Writing Java code...");
    }

    @Override
    public void working(Test test) {
        System.out.println("Writing tests for Java code...");
    }
}
