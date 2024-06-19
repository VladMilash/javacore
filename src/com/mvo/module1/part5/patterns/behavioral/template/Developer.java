package src.com.mvo.module1.part5.patterns.behavioral.template;

public abstract class Developer {
    private String name;

    public Developer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void working(){
        System.out.println(name + " Open Tasks\n" + "Start working");
        writeCode();
        System.out.println(name + " has finishing work");
    }

    protected abstract void writeCode();
}
