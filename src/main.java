import java.util.List;

public class main {
    public static void main(String[] args) {
        Author author1 = new Author("J.K. Rowling", "jkrowling@gmail.com", "United Kingdom", 'F');
        Author author2 = new Author("Stephen King", "sking@gmail.com", "United States", 'M');

        Book book1 = new Book("Harry Potter and the Philosopher's Stone", 1997, author1, 10.99, 100);
        Book book2 = new Book("Harry Potter and the Chamber of Secrets", 1998, author1, 12.99, 75);
        Book book3 = new Book("Harry Potter and the Prisoner of Azkaban", 1999, author1, 14.99, 50);
        Book book4 = new Book("The Shining", 1977, author2, 9.99, 200);
        Book book5 = new Book("Carrie", 1974, author2, 7.99, 150);

        Library library = new Library();
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);

        List<Book> result = library.searchByAuthor("J.K. Rowling");
        for (Book book : result) {
            System.out.println(book.getTitle() + " by " + book.getAuthor().getName() + ", published in " + book.getYearPublished() + ", price: " + book.getPrice() + ", qty: " + book.getQty());
        }
    }
}