package my.learning.choesion;

import java.util.ArrayList;
import java.util.List;

public class MessyRoom {
    List<Item> items = new ArrayList<>();

    void addItem(Item item) {
        items.add(item);
    }

    Item findBook(String title) {
        for (Item item : items) {
            if (item.type.equals("book") && item.title.equals(title)) {
                return item;
            }
        }
        return null;
    }

    List<String> listBooks() {
        List<String> books = new ArrayList<>();
        for (Item item : items) {
            if (item.type.equals("book")) {
                books.add(item.title);
            }
        }
        return books;
    }

}
