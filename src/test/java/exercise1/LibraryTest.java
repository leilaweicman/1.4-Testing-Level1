package exercise1;

import org.junit.jupiter.api.Test;

import java.util.List;

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

    @Test
    void addBookShouldKeepListOrderedAlphabetically() {
        Library library = new Library();
        library.addBook(new Book("Book C"));
        library.addBook(new Book("Book A"));
        library.addBook(new Book("Book B"));

        library.addBook(new Book("Book D"), 1);

        List<String> titles = library.getBooks().stream().map(Book::getTitle).toList();

        assertEquals(List.of("Book A", "Book B", "Book C", "Book D"), titles, "Books should remain in alphabetical order after insertion");
    }

    @Test
    void deleteBookShouldDecreaseListSize() {
        Library library = new Library();
        library.addBook(new Book("Book A"));
        library.addBook(new Book("Book B"));

        int initialSize = library.getBooks().size();
        boolean deleted = library.deleteBookByTitle("Book B");

        assertTrue(deleted, "Book should be deleted successfully");
        assertEquals(initialSize - 1, library.getBooks().size(), "Library size should decrease after deletion");
    }
}
