package src.com.mvo.module1.part5.patterns.behavioral.visitor;

public class PythonDeveloper implements Developer {
    @Override
    public void working(Code code) {
        System.out.println("Writing Python code...");
    }

    @Override
    public void working(Test test) {
        System.out.println("Writing tests for Python code...");
    }
}
