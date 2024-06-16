package src.com.mvo.module1.part5.patterns.creational.prototype;

public class Resume implements Copyable{
    private String fullName;
    private String uuid;

    public Resume(String fullName, String uuid) {
        this.fullName = fullName;
        this.uuid = uuid;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    @Override
    public Object copy() {
        return new Resume(fullName,uuid);
    }

    @Override
    public String toString() {
        return "Resume{" +
                "fullName='" + fullName + '\'' +
                ", uuid='" + uuid + '\'' +
                '}';
    }
}
