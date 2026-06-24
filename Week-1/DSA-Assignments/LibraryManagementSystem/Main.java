package LibraryManagementSystem;

public class Main {
    public static void main(String[] args) {
        Library library = new Library(5);

        library.addBook(301, "Java Basics", "James Gosling");
        library.addBook(302, "Data Structures", "Mark Allen Weiss");
        library.addBook(303, "Algorithms", "Mark Allen Weiss");

        System.out.println("Search by Title:");
        Book searchedBook = library.findBookByTitle("Data Structures");
        if (searchedBook != null) {
            System.out.println(searchedBook);
        } else {
            System.out.println("Book not found");
        }

        System.out.println();
        System.out.println("Search by Author:");
        library.displayBooksByAuthor("Mark Allen Weiss");
    }
}
