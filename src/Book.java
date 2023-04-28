public class Book {
    private String title;
    private int yearPublished;
    private Author author;
    private double price;
    private int qty;

    public Book(String title, int yearPublished, Author author, double price, int qty) {
        this.title = title;
        this.yearPublished = yearPublished;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    public String getTitle() {
        return title;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }
}