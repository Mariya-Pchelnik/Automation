package collections.mainTask.present;

import collections.mainTask.sweetsHierarchy.*;

import java.util.ArrayList;
import java.util.List;

public class ActionsWithPresent {

    public static List<Sweet> createPresent() {
        List<Sweet> present = new ArrayList();
        present.add(new ChocolateBar("Twix", "Mars",
                55, 24, 10, "карамель и печенье",
                ChocolateTypes.WHITE_CHOCOLATE));
        present.add(new ChocolateBar("Milky Way", "Mars",
                26, 17, 27, "молочная нуга",
                ChocolateTypes.MILK_CHOCOLATE));
        present.add(new Lollipop("Цитрусовый микс", "Roshen",
                7, 5, "Лимон"));
        present.add(new Lollipop("Цитрусовый микс", "Roshen",
                7, 5, "Апельсин"));
        present.add(new ChocolateCandy("Лилия", "Roshen",
                10, 7, 25, ChocolateCandyFillings.CREAM));
        present.add(new ChocolateCandy("Нуга ванильная", "Roshen",
                7, 5, 25, ChocolateCandyFillings.NOUGAT));
        present.add(new ChocolateCandy("Choco Crazy", "Roshen",
                5, 3, 18, ChocolateCandyFillings.FRUIT_JELLY));
        present.add(new ChocolateCandy("Грильяж", "Koммунарка", 12,
                7, 20, ChocolateCandyFillings.GRATED_NUTS));

        return present;
    }

    public static List<Sweet> sortSweetsByWeight(List<Sweet> present) {
        present.sort(new Sweet.SweetComparator());
        return present;
    }

    public static List<Sweet> findSweetsWithCertainSugarAmount(List<Sweet> present,
                                                               int minSugar, int maxSugar) {
        List<Sweet> sweetsWithCertainAmountOfSugar = new ArrayList();

        for (Sweet sweet : present) {
            if (sweet.getSugarAmount() > minSugar && sweet.getSugarAmount() <= maxSugar)
                sweetsWithCertainAmountOfSugar.add(sweet);
        }
        return sweetsWithCertainAmountOfSugar;
    }

    public static void printPresent(List<Sweet> present) {
        for (Sweet sweet : present) {
            System.out.println(sweet);
        }
    }
}
