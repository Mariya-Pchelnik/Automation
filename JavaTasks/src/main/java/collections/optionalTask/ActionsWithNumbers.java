package collections.optionalTask;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Stack;

public class ActionsWithNumbers {
    private Scanner inputNumber = new Scanner(System.in);
    private int number;

    public void printNumberWithDigitsInReverseOrder() {
        try {
            System.out.println("Введите число");
            number = inputNumber.nextInt();
        } catch (InputMismatchException ex) {
            System.out.println("Введите численное значение");
        }

        Stack<Character> stackOfDigits = new Stack();
        char[] arrayOfDigits = String.valueOf(number).toCharArray();
        for (char digit : arrayOfDigits) {
            stackOfDigits.push(digit);
        }

        System.out.println("Число, у которого цифры идут в обратном порядке.");
        while (!stackOfDigits.isEmpty()) {
            System.out.print(stackOfDigits.pop());
        }
    }
}
