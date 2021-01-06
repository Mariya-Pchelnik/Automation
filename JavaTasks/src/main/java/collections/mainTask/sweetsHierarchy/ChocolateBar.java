package collections.mainTask.sweetsHierarchy;

public class ChocolateBar extends Sweet {
    private int cocoaPercentage;
    private String filling;
    private ChocolateTypes type;

    public ChocolateBar(String name, String manufacturer, int weight, int sugarCount,
                        int cocoaPercentage, String filling, ChocolateTypes type) {
        super(name, manufacturer, weight, sugarCount);
        this.cocoaPercentage = cocoaPercentage;
        this.filling = filling;
        this.type = type;
    }

    public int getCocoaPercentage() {
        return cocoaPercentage;
    }

    public String getFilling() {
        return filling;
    }

    public ChocolateTypes getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Шоколадная питка: " + getName()
                + ";\tпроизводитель: " + getManufacturer()
                + ";\tтип шоколада: " + getType().toString()
                + ";\tсодержание какао(%): " + getCocoaPercentage()
                + ";\tначинка: " + getFilling()
                + ";\tсодержание сахара: " + getSugarAmount() +
                ";\tвес:" + getWeight();
    }
}
