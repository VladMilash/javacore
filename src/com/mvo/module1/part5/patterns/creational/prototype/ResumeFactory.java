package src.com.mvo.module1.part5.patterns.creational.prototype;

public class ResumeFactory {
    private Resume resume;

    public ResumeFactory(Resume resume) {
        this.resume = resume;
    }

    public Resume getResume() {
        return resume;
    }

    public Resume cloneResume(){
        return (Resume) resume.copy();
    }
}
