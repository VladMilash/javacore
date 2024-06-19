package src.com.mvo.module1.part5.patterns.behavioral.template;

public class PythonDeveloper extends Developer {
    public PythonDeveloper(String name) {
        super(name);
    }

    @Override
    protected void writeCode() {
        System.out.println(getName() + " writing Python code...");
    }
}
