package classes;

public class ActionsWithBooks {
    public static Book[] CreateBooksArray() {
        Book[] booksArray = new Book[5];
        booksArray[0] = new Book("Повелитель мух", "Уильям Голдинг", "АСТ",
                2015, 320, 7.25, "Мягкий переплет");
        booksArray[1] = new Book("Пикник на обочине", "Аркадий Стругацкий",
                "Борис Стругацкий", "АСТ", 2019,
                256, 7.97, "Твердый переплет");
        booksArray[2] = new Book("Малыш", "Аркадий Стругацкий",
                "Борис Стругацкий", "АСТ", 2016,
                206, 9.62, "Твердый переплет");
        booksArray[3] = new Book("Десять негритят", "Агата Кристи",
                "Эксмо", 2016, 320, 8.45,
                "Твердый переплет");
        booksArray[4] = new Book("12 лет рабства", "Соломон Нортап",
                "Эксмо", 2019, 416, 8.55,
                "Мягкая обложка");

        for (Book book : booksArray) {
            if (book.getSecondAuthor() == null) {
                book.setSecondAuthor("нет соавтора");
            }
        }
        return booksArray;
    }

    public static void printBooksOfCertainAuthor(String author,
                                                 Book[] booksArray) {
        for (Book book : booksArray) {
            if (book.getAuthor().equals(author)
                    || book.getSecondAuthor().equals(author)) {
                System.out.println(book.toString());
            }
        }
    }

    public static void printBooksOfCertainPublisher(String publisher,
                                                    Book[] booksArray) {
        for (Book book : booksArray) {
            if (book.getPublisher().equals(publisher)) {
                System.out.println(book.toString());
            }
        }
    }

    public static void printBooksPublishedAfterCertainYear(int yearOfPublication,
                                                           Book[] booksArray) {
        for (Book book : booksArray) {
            if (book.getYearOfPublication() > yearOfPublication)
                System.out.println(book.toString());
        }
    }
}