package fundamentals.mainTask;

public class Task4 {

    static void printSumOfArguments(int[] array) {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("Сумма чисел: "+sum);
    }

    static void printProductOfArguments(int[] array) {
        int product = 0;

        for (int i = 0; i < array.length; i++) {
            product *= array[i];
        }
        System.out.println("Произведение чисел: "+product);
    }

    public static void main(String[] args) {
        int[] array = new int[args.length];

        try {
            for (int i = 0; i < args.length; i++) {
                array[i] = Integer.parseInt(args[i]);
            }
        } catch (NumberFormatException e) {
            System.err.println("Аргумент не является числом");
            System.exit(1);
        }

        printSumOfArguments(array);
        printProductOfArguments(array);
    }
}
