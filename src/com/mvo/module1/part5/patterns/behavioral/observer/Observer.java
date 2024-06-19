package src.com.mvo.module1.part5.patterns.behavioral.observer;

import java.util.List;

public interface Observer {
    void handleEvent(List<String> phoneModels);
}
