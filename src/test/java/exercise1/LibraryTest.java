package exercise1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LibraryTest {

    @Test
    void booksListIsNotNullOnNewLibrary() {
        Library library = new Library();
        assertNotNull(library.getBooks());
    }

    @Test
    void booksListIsEmptyOnNewLibrary() {
        Library library = new Library();
        assertEquals(0, library.getBooks().size());
    }

    @Test
    void booksListHasExpectedSizeAfterInsertBooks() {
        Library library = new Library();
        library.addBook(new Book("Book A"));
        library.addBook(new Book("Book B"));
        library.addBook(new Book("Book C"));

        assertEquals( 3, library.getBooks().size(), "Library should contain 3 books after adding them");
    }
}
