package collections.mainTask.sweetsHierarchy;

public class ChocolateCandy extends Sweet {
    private int cocoaPercentage;
    private ChocolateCandyFillings filling;

    public ChocolateCandy(String name, String manufacturer, int weight, int sugarCount,
                          int cocoaPercentage, ChocolateCandyFillings filling) {
        super(name, manufacturer, weight, sugarCount);
        this.cocoaPercentage = cocoaPercentage;
        this.filling = filling;
    }

    public int getCocoaPercentage() {
        return cocoaPercentage;
    }

    public ChocolateCandyFillings getFilling() {
        return filling;
    }

    @Override
    public String toString() {
        return "Шоколадная конфета:" + getName()
                + ";\tпроизводитель: " + getManufacturer()
                + ";\tсодержание какао(%): " + getCocoaPercentage()
                + ";\tначинка: " + getFilling()
                + ";\tсодержание сахара(г.): " + getSugarAmount()
                + ";\tвес(г.):" + getWeight();
    }
}
