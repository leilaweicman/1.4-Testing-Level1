package exercise1;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private final List<Book> books = new ArrayList<>();

    public List<Book> getBooks() {
        return books;
    }

    public String getBookTitle(int position) {
        return books.get(position).getTitle();
    }
}
