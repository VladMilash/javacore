package src.com.mvo.module1.part5.patterns.behavioral.template;

public class Main {
    public static void main(String[] args) {
        JavaDeveloper javaDeveloper = new JavaDeveloper("Ivan");
        PythonDeveloper pythonDeveloper = new PythonDeveloper("Nikita");

        javaDeveloper.working();
        pythonDeveloper.working();
    }
}
