import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<String> books = new ArrayList<>();
    private List<String> issuedBooks = new ArrayList<>();

    public void addBook(String book) {
        books.add(book);
        System.out.println("Book added: " + book);
    }

    public List<String> getBooks() {
        return books;
    }

    public String searchBook(String book) {
        if (books.contains(book)) {
            return "Book found: " + book;
        } else {
            return "Book not found";
        }
    }

    public String issueBook(String book) {
        if (books.contains(book) && !issuedBooks.contains(book)) {
            issuedBooks.add(book);
            books.remove(book);
            return "Book issued: " + book;
        } else {
            return "Book not available for issuance.";
        }
    }

    public String returnBook(String book) {
        if (issuedBooks.contains(book)) {
            issuedBooks.remove(book);
            books.add(book);
            return "Book returned: " + book;
        } else {
            return "Book was not issued.";
        }
    }

    public void viewCatalog() {
        System.out.println("Available books: " + books);
        System.out.println("Issued books: " + issuedBooks);
    }
}
