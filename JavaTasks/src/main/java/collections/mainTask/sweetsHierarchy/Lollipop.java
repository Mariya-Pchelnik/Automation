package collections.mainTask.sweetsHierarchy;

public class Lollipop extends Sweet {
    private String flavour;

    public Lollipop(String name, String manufacturer, int weight,
                    int sugarCount, String flavour) {
        super(name, manufacturer, weight, sugarCount);
        this.flavour = flavour;
    }

    public String getFlavour() {
        return flavour;
    }

    @Override
    public String toString() {
        return "Леденец" + getName()
                + ", производитель: " + getManufacturer()
                + "вкус:" + getFlavour()
                + ", содержание сахара: " + getSugarAmount()
                + ", вес:" + getWeight();
    }
}
