package src.com.mvo.module1.part5.patterns.behavioral.memento;

import java.util.Date;

public class Save {
    private final String note;
    public final Date date;

    public Save(String note) {
        this.note = note;
        this.date = new Date();
    }

    public String getNote() {
        return note;
    }

    public Date getDate() {
        return date;
    }
}
