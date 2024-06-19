package src.com.mvo.module1.part5.patterns.behavioral.visitor;

public class Main {
    public static void main(String[] args) {
        WorkingProcess workingProcess = new WorkingProcess();
        JavaDeveloper javaDeveloper = new JavaDeveloper();
        PythonDeveloper pythonDeveloper = new PythonDeveloper();

        workingProcess.doWork(javaDeveloper);
        workingProcess.doWork(pythonDeveloper);
    }
}
