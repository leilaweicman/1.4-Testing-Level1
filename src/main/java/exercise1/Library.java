package exercise1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class Library {
    private final List<Book> books = new ArrayList<>();

    public List<Book> getBooks() {
        return books;
    }

    public String getBookTitle(int position) {
        return books.get(position).getTitle();
    }

    public boolean addBook(Book book) {
        Objects.requireNonNull(book, "book must not be null");
        if (containsTitle(book.getTitle())) return false;
        books.add(book);
        sortByTitle();
        return true;
    }

    public boolean addBook(Book book, int position) {
        Objects.requireNonNull(book, "book must not be null");
        if (containsTitle(book.getTitle())) return false;
        if (position < 0 || position > books.size()) {
            throw new IndexOutOfBoundsException("index: " + position);
        }
        books.add(position, book);
        sortByTitle();
        return true;
    }

    private boolean containsTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) return true;
        }
        return false;
    }

    private void sortByTitle() {
        books.sort(Comparator.comparing(Book::getTitle, String.CASE_INSENSITIVE_ORDER));
    }
}
