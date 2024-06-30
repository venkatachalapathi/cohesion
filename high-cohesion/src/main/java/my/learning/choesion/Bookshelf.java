package my.learning.choesion;

import java.util.ArrayList;
import java.util.List;

public class Bookshelf {
    String category;
    List<Book> books = new ArrayList<>();

    Bookshelf(String category) {
        this.category = category;
    }

    void addBook(Book book) {
        books.add(book);
    }

    Book findBook(String title) {
        for (Book book : books) {
            if (book.title.equals(title)) {
                return book;
            }
        }
        return null;
    }

    List<String> listBooks() {
        List<String> bookTitles = new ArrayList<>();
        for (Book book : books) {
            bookTitles.add(book.title);
        }
        return bookTitles;
    }
}
