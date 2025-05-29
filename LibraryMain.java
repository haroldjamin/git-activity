public class LibraryMain {
    public static void main(String[] args) {
        Library library = new Library();

        // Add books
        library.addBook("The Great Gatsby");
        library.addBook("1984");

        // Issue one book
        library.issueBook("1984");

        // View full catalog
        library.viewCatalog();
    }
}
