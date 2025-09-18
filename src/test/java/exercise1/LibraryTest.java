package exercise1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LibraryTest {

    @Test
    void bookListIsNotNullOnNewLibrary() {
        Library library = new Library();
        assertNotNull(library.getBooks());
    }

    @Test
    void booksListIsEmptyOnNewLibrary() {
        Library library = new Library();
        assertEquals(0, library.getBooks().size());
    }

}
