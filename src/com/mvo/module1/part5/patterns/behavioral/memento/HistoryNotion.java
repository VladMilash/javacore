package src.com.mvo.module1.part5.patterns.behavioral.memento;

public class HistoryNotion {
    private Save save;

    public Save getSave() {
        return save;
    }

    public void setSave(Save save) {
        this.save = save;
    }
}
