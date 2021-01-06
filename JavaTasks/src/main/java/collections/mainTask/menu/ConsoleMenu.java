package collections.mainTask.menu;

import collections.mainTask.present.ActionsWithPresent;
import collections.mainTask.sweetsHierarchy.Sweet;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ConsoleMenu {
    private Scanner inputActionNumber = new Scanner(System.in);
    private int actionNumber;
    private static List<Sweet> present = ActionsWithPresent.createPresent();

    public void createMenu() {
        try {
            while (actionNumber != 4) {
                System.out.println("Выберете пункт меню:");
                System.out.println("1.Вывести содержимое подарка на экран");
                System.out.println("2.Отсортировать сладости в подарке по весу");
                System.out.println("3.Найти конфеты с содержанием сахара в диапазоне 10-20 грамм");
                System.out.println("4. Выход из меню");

                actionNumber = inputActionNumber.nextInt();

                switch (actionNumber) {
                    case 1:
                        ActionsWithPresent.printPresent(present);
                        break;
                    case 2:
                        List<Sweet> sortedByWeightSweets = ActionsWithPresent.sortSweetsByWeight(present);
                        ActionsWithPresent.printPresent(sortedByWeightSweets);
                        break;
                    case 3:
                        List<Sweet> sweetsBySugarAmount = ActionsWithPresent.
                                findSweetsWithCertainSugarAmount(present, 10, 20);
                        ActionsWithPresent.printPresent(sweetsBySugarAmount);
                        break;
                    case 4:
                        System.out.println("Выход из меню");
                        break;
                    default:
                        System.out.println("В меню нет такого пункта, повторите ввод");
                }
            }
        } catch (InputMismatchException exception) {
            System.out.println("Вы ввели нечисловое значение");
        }
    }
}

