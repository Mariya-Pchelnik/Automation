package classes;

public class Main {
    public static void main(String[] args) {
        Book [] books= ActionsWithBooks.CreateBooksArray();

        System.out.println("\nСписок книг заданного автора");
        ActionsWithBooks.printBooksOfCertainAuthor("Аркадий Стругацкий",books);

        System.out.println("\nСписок книг, выпущенных заданным издательством");
        ActionsWithBooks.printBooksOfCertainPublisher("АСТ", books);

        System.out.println("\nСписок книг, выпущенных после заданного года");
        ActionsWithBooks.printBooksPublishedAfterCertainYear(2016,books);
    }
}
