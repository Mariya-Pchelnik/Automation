package fundamentals.optionalTasks;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {

    static void printMinimumNumberLength(String[] array) {
        int minLength = array[0].length();
        int index = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i].length() < minLength) {
                minLength = array[i].length();
                index = i;
            }
        }
        System.out.println("Наименьшая длина:" + minLength);
        System.out.println("Число с наименьшей длиной:"
                + array[index]);
    }


    static void printMaximumNumberLength(String[] array) {
        int maxLength = array[0].length();
        int index = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i].length() > maxLength) {
                maxLength = array[i].length();
                index = i;
            }
        }
        System.out.println("Наибольшая длина:" + maxLength);
        System.out.println("Число с наибольшей длиной:" + array[index]);
    }

    static void printNumbersInLengthAscendingOrder(String[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j].length() > array[j + 1].length()) {
                    String buffer = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = buffer;
                }
            }
        }

        System.out.println("Числа в порядке возрастания значений их длины: ");
        for (String number : array) {
            System.out.print(number + "\t");
        }
    }

    static void printNumbersInLengthDecreasingOrder(String[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j].length() < array[j + 1].length()) {
                    String buffer = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = buffer;
                }
            }
        }

        System.out.println("\n Числа в порядке убывания их длины: ");
        for (String number : array) {
            System.out.print(number + "\t");
        }
    }

    static double getAverageLength(String[] array) {
        int lengthSum = 0;

        for (int i = 0; i < array.length; i++) {
            lengthSum += array[i].length();
        }
        return (double) lengthSum / (double) array.length;
    }

    static void NumbersWithLengthGreaterThanAverage(String[] array) {
        double averageLength = getAverageLength(array);

        System.out.println("Числа, длина которых больше средней " +
                "длины по всем числам: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i].length() > averageLength)
                System.out.println(array[i] + "\t");
        }
    }

    static void NumbersWithLengthSmallerThanAverage(String[] array) {
        double averageLength = getAverageLength(array);

        System.out.println("Числа, длина которых меньше средней " +
                "длины по всем числам: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i].length() < averageLength)
                System.out.println(array[i] + "\t");
        }
    }

    static void printNumberWithMinimumAmountOfDifferentDigits(String[] array) {
        int[] amountsOfDifferentDigitsArray = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            amountsOfDifferentDigitsArray[i] = array[i].length();
            char[] digitsArray = array[i].toCharArray();
            for (int j = 0; j < digitsArray.length; j++) {
                for (int k = j + 1; k < digitsArray.length; k++) {
                    if (digitsArray[j] == digitsArray[k]) {
                        amountsOfDifferentDigitsArray[i]--;
                        break;
                    }
                }
            }
        }

        int minAmountOfDifferentDigits = amountsOfDifferentDigitsArray[0];
        int NumberWithMinAmountOfDifferentDigitsIndex = 0;
        for (int i = 0; i < amountsOfDifferentDigitsArray.length; i++) {
            if (amountsOfDifferentDigitsArray[i] < minAmountOfDifferentDigits) {
                minAmountOfDifferentDigits = amountsOfDifferentDigitsArray[i];
                NumberWithMinAmountOfDifferentDigitsIndex = i;
            }
        }
        System.out.println("Наименьшее количество различных цифр:"
                + minAmountOfDifferentDigits);
        System.out.println("Число с наименьшим количеством различных цифр:"
                +array[NumberWithMinAmountOfDifferentDigitsIndex]);

    }

    public static void main(String[] args) {
        final int N = 5;
        Scanner number = new Scanner(System.in);
        String[] array = new String[N];

        try {
            System.out.println("Введите числа: ");
            for (int i = 0; i < N; i++) {
                array[i] = String.valueOf(number.nextInt());
            }

        } catch (InputMismatchException exception) {
            System.out.println("Введите число");
        }

        printNumberWithMinimumAmountOfDifferentDigits(array);
        printMaximumNumberLength(array);
        printMinimumNumberLength(array);
        printNumbersInLengthAscendingOrder(array);
        printNumbersInLengthDecreasingOrder(array);
        System.out.println("Средняя длина: " + getAverageLength(array));
        NumbersWithLengthGreaterThanAverage(array);
        NumbersWithLengthSmallerThanAverage(array);
    }
}
