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

    @Test
    void booksListHasBookInSpecificPosition() {
        Library library = new Library();
        library.addBook(new Book("Book A"));
        library.addBook(new Book("Book B"));
        library.addBook(new Book("Book C"));

        assertEquals("Book B", library.getBookTitle(1), "Library should return 'Book B' at position 1");
    }

    @Test
    void booksLibraryHasNoDuplicateTitles() {
        Library library = new Library();
        library.addBook(new Book("Book A"));
        library.addBook(new Book("Book B"));

        assertThrows(IllegalArgumentException.class, () -> library.addBook(new Book("Book A")), "Adding a duplicate book should throw an exception");
        assertEquals(2, library.getBooks().size(), "Library size should remain 2 after trying to add duplicate");
    }

    @Test
    void canRetrieveTitleByPosition() {
        Library library = new Library();
        library.addBook(new Book("Book B"));
        library.addBook(new Book("Book A"));

        assertEquals("Book A", library.getBookTitle(0), "Library should return 'Book A' at position 0");
        assertEquals("Book B", library.getBookTitle(1), "Library should return 'Book B' at position 1");
    }

    @Test
    void addBookShouldModifyBooksList() {
        Library library = new Library();
        Book book = new Book("Book A");

        boolean added = library.addBook(book);

        assertEquals(1, library.getBooks().size(), "Library should contain 1 book after adding");
        assertTrue(added, "Book should be added successfully");
        assertEquals("Book A", library.getBooks().get(0).getTitle(), "The added book should be in the list");
    }
}
