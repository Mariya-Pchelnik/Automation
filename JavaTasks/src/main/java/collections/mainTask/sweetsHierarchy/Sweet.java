package collections.mainTask.sweetsHierarchy;

import java.util.Comparator;

public class Sweet {
    private String name;
    private String manufacturer;
    private int weight;
    private int sugarCount;

    public Sweet(String name, String manufacturer,
                 int weight, int sugarCount) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.weight = weight;
        this.sugarCount = sugarCount;
    }

    public String getName() {
        return name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getWeight() {
        return weight;
    }

    public int getSugarAmount() {
        return sugarCount;
    }

    public static class SweetComparator implements Comparator<Sweet> {
        @Override
        public int compare(Sweet o1, Sweet o2) {
            return Integer.compare(o1.weight, o2.weight);
        }
    }
}
