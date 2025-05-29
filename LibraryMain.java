public class LibraryMain {
    public static void main(String[] args) {
        Library library = new Library();
        library.addBook("The Great Gatsby");

        System.out.println("Books in library: " + library.getBooks());
        System.out.println(library.issueBook("1984"));
        System.out.println(library.returnBook("The Great Gatsby"));
        System.out.println(library.searchBook("1984"));
    }
}
