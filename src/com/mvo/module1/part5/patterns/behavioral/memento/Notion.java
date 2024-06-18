package src.com.mvo.module1.part5.patterns.behavioral.memento;

import java.util.Date;

public class Notion {
    private String note;
    private Date date;

    public void setNotAndDate(String not) {
        this.note = not;
        this.date = new Date();
    }

    public Save save() {
        return new Save(note);
    }

    public void load(Save save) {
        note = save.getNote();
        date = save.getDate();
    }

    @Override
    public String toString() {
        return "Notion{" +
                "not='" + note + '\'' +
                ", date=" + date +
                '}';
    }
}
