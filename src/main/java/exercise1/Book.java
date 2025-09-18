package exercise1;

public class Book {
    private final String title;

    public Book(String title) {
        if (title == null || title.trim().isEmpty()) {
            throw new IllegalArgumentException("Title must not be blank");
        }
        this.title = title.trim();
    }

    public String getTitle() { return title; }
}
