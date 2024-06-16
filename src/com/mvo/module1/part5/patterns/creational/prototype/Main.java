package src.com.mvo.module1.part5.patterns.creational.prototype;

public class Main {
    public static void main(String[] args) {
        Resume resume = new Resume("Ivan Petrov", "uuid1");
        System.out.println(resume);

        ResumeFactory resumeFactory = new ResumeFactory(resume);
        Resume cloneResume = resumeFactory.cloneResume();
        System.out.println(cloneResume);
    }
}
