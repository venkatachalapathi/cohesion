package my.learning.choesion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrganizedRoom {
    Map<String, Bookshelf> shelves = new HashMap<>();

    void addShelf(String category) {
        if (!shelves.containsKey(category)) {
            shelves.put(category, new Bookshelf(category));
        }
    }

    void addBook(String category, Book book) {
        if (!shelves.containsKey(category)) {
            addShelf(category);
        }
        shelves.get(category).addBook(book);
    }

    Book findBook(String category, String title) {
        if (shelves.containsKey(category)) {
            return shelves.get(category).findBook(title);
        }
        return null;
    }

    List<String> listBooksByCategory(String category) {
        if (shelves.containsKey(category)) {
            return shelves.get(category).listBooks();
        }
        return new ArrayList<>();
    }
}
