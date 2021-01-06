package classes;

public class Book {
    private String name;
    private String author;
    private String secondAuthor;
    private String publisher;
    private int yearOfPublication;
    private int pageNumber;
    private double price;
    private String bookBinding;

    public Book() {

    }

    public Book(String name, String author, String publisher, int yearOfPublication,
                int pageNumber, double price, String bookBinding) {
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.yearOfPublication = yearOfPublication;
        this.pageNumber = pageNumber;
        this.price = price;
        this.bookBinding = bookBinding;
    }

    public Book(String name, String author, String secondAuthor, String publisher,
                int yearOfPublication, int pageNumber, double price, String bookBinding) {
        this.name = name;
        this.author = author;
        this.secondAuthor = secondAuthor;
        this.publisher = publisher;
        this.yearOfPublication = yearOfPublication;
        this.pageNumber = pageNumber;
        this.price = price;
        this.bookBinding = bookBinding;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setSecondAuthor(String secondAuthor) {
        this.secondAuthor = secondAuthor;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setBookBinding(String bookBinding) {
        this.bookBinding = bookBinding;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getSecondAuthor() {
        return secondAuthor;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public double getPrice() {
        return price;
    }

    public String getBookBinding() {
        return bookBinding;
    }

    @Override
    public String toString() {
        return "Название: " + name + '\'' + ", автор: " + author + '\''
                + ", соавтор: " + secondAuthor + '\''
                + ", издательство: " + publisher + '\''
                + ", год издания: " + yearOfPublication + '\''
                + ", количество страниц: " + pageNumber + '\''
                + ", цена: " + price + ", тип переплета: " + bookBinding;
    }
}
