package src.com.mvo.module1.part5.patterns.creational.builder;

public class Cottage {
    private String house;
    private String fence;
    private String garden;
    private String swing;

    public Cottage(CottageBuilder cottageBuilder) {
        this.house = cottageBuilder.getHouse();
        this.fence = cottageBuilder.getFence();
        this.garden = cottageBuilder.getGarden();
        this.swing = cottageBuilder.getSwing();
    }

    public void cottageComposition() {
        StringBuilder composition = new StringBuilder("Was built: \n");
        String[] fields = {house, fence, garden, swing};
        for (String field : fields) {
            if (field != null) {
                composition.append(field).append("\n");
            }
        }
        System.out.println(composition);
    }
}
