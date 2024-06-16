package src.com.mvo.module1.part5.patterns.creational.builder;

public class CottageBuilder {
    private String house;
    private String fence;
    private String garden;
    private String swing;

    public CottageBuilder buildHouse(String walls) {
        this.house = walls;
        return this;
    }

    public CottageBuilder buildFence(String windows) {
        this.fence = windows;
        return this;
    }

    public CottageBuilder buidGarden(String doors) {
        this.garden = doors;
        return this;
    }

    public CottageBuilder buidSwing(String roof) {
        this.swing = roof;
        return this;
    }

    public Cottage build() {
        return new Cottage(this);
    }

    public String getHouse() {
        return house;
    }

    public String getFence() {
        return fence;
    }

    public String getGarden() {
        return garden;
    }

    public String getSwing() {
        return swing;
    }
}
