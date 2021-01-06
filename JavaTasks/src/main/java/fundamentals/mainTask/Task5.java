package fundamentals.mainTask;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task5 {
    static void printMonth(int i) {
        String[] array = {"январь", "февраль", "март", "апрель", "май",
                "июнь", "июль", "август", "сентябрь", "октябрь", "ноябрь", "декабрь"};
        String month = array[i - 1];

        System.out.println(month);
    }

    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        try {
            int monthNumber = number.nextInt();

            if (0 < monthNumber && monthNumber <= 12) {
                printMonth(monthNumber);
            } else {
                System.out.println("Такого месяца не существует");
            }
        } catch (InputMismatchException exception) {
            System.out.println("Введите число");
        }
    }
}
