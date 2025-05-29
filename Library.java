import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<String> books = new ArrayList<>();
    private List<String> issuedBooks = new ArrayList<>(); // New list to track issued books

    public void addBook(String book) {
        books.add(book);
        System.out.println("Book added: " + book);
    }

    public List<String> getBooks() {
        return books;
    }

    // Method to issue a book
    public String issueBook(String book) {
        if (books.contains(book) && !issuedBooks.contains(book)) {
            issuedBooks.add(book);
            books.remove(book);
            return "Book issued: " + book;
        } else {
            return "Book not available for issuance.";
        }
    }

    // Method to search for a book
    public String searchBook(String book) {
        if (books.contains(book)) {
            return "Book found: " + book;
        } else {
            return "Book not found";
        }
    }
}