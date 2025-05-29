import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<String> books = new ArrayList<>();

    public void addBook(String book) {
        books.add(book);
        System.out.println("Book added: " + book);
    }

    public List<String> getBooks() {
        return books;
    }

    // New searchBook method
    public String searchBook(String book) {
        if (books.contains(book)) {
            return "Book found: " + book;
        } else {
            return "Book not found";
        }
    }
}
