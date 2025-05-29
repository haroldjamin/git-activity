public class LibraryMain {
    public static void main(String[] args) {
        Library library = new Library();

        // Add books
        library.addBook("The Great Gatsby");
        library.addBook("1984");

        // Issue a book
        System.out.println(library.issueBook("1984"));

        // Return a book
        System.out.println(library.returnBook("The Great Gatsby"));

        // Search for a book
        System.out.println(library.searchBook("1984"));

        // View catalog
        library.viewCatalog();
    }
}
