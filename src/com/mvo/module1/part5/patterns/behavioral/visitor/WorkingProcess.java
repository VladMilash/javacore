package src.com.mvo.module1.part5.patterns.behavioral.visitor;

import java.util.List;

public class WorkingProcess implements WorkElement {
    WorkElement[] workElements;

    public WorkingProcess() {
        this.workElements = new WorkElement[]{
                new Code(),
                new Test()
        };
    }

    @Override
    public void doWork(Developer developer) {
        for (WorkElement workElement : workElements) {
            workElement.doWork(developer);
        }
    }
}
