package LibraryManagementSystem;

public class Library {
    private Book[] books;
    private int count;

    public Library(int capacity) {
        books = new Book[capacity];
        count = 0;
    }

    public boolean addBook(int bookId, String title, String author) {
        if (count == books.length) {
            return false;
        }

        books[count] = new Book(bookId, title, author);
        count++;
        return true;
    }

    public Book findBookByTitle(String title) {
        for (int index = 0; index < count; index++) {
            if (books[index].getTitle().equalsIgnoreCase(title)) {
                return books[index];
            }
        }
        return null;
    }

    public void displayBooksByAuthor(String author) {
        boolean found = false;
        for (int index = 0; index < count; index++) {
            if (books[index].getAuthor().equalsIgnoreCase(author)) {
                System.out.println(books[index]);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No books found for author: " + author);
        }
    }
}
