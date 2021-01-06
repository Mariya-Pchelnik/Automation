package fundamentals.mainTask;

import java.util.Random;

public class Task3 {

    static int[] getArrayOfRandomNumbers() {
        int amount = 5;
        int[] array = new int[amount];
        Random random = new Random();

        for (int i = 0; i < amount; i++) {
            array[i] = random.nextInt();
        }
        return array;
    }

    static void printNumbersWithTransferToNewLine(int[] array) {
        for (int number : array) {
            System.out.println(number);
        }
    }

    static void printNumbersWithoutTransferToNewLine(int[] array) {
        for (int number : array) {
            System.out.print(number + "\t");
        }
    }

    public static void main(String[] args) {
        int [] arrayOfRandomNumbers=getArrayOfRandomNumbers();

        System.out.println("Числа без перехода на новую строку:");
        printNumbersWithoutTransferToNewLine(arrayOfRandomNumbers);

        System.out.println("\nЧисла с переходом на новую строку:");
        printNumbersWithTransferToNewLine(arrayOfRandomNumbers);
    }

}
