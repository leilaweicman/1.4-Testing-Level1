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
        validateBook(book);
        if (containsTitle(book.getTitle())) return false;
        books.add(book);
        sortByTitle();
        return true;
    }

    public boolean addBook(Book book, int position) {
       validateBook(book);
        if (position < 0 || position > books.size()) {
            throw new IndexOutOfBoundsException("index: " + position);
        }
        books.add(position, book);
        sortByTitle();
        return true;
    }

    public boolean deleteBookByTitle(String title) {
        validateTitle(title);
        boolean removed = books.removeIf(book -> book.getTitle().equalsIgnoreCase(title));
        if (removed) sortByTitle();
        return removed;
    }

    private void validateBook(Book book) {
        Objects.requireNonNull(book, "book must not be null");
        if (containsTitle(book.getTitle())) {
            throw new IllegalArgumentException("Book already exists: " + book.getTitle());
        }
    }

    private void validateTitle(String title) {
        Objects.requireNonNull(title, "title must not be null");
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
