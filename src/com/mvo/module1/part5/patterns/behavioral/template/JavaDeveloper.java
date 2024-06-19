package src.com.mvo.module1.part5.patterns.behavioral.template;

public class JavaDeveloper extends Developer {
    public JavaDeveloper(String name) {
        super(name);
    }

    @Override
    protected void writeCode() {
        System.out.println(getName() + " writing Java code...");
    }
}
