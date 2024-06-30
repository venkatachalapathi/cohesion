package my.learning.choesion;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        MessyRoom room = new MessyRoom();
        room.addItem(new Item("book", "Moby Dick"));
        room.addItem(new Item("toy", "Lego"));
        room.addItem(new Item("book", "1984"));

        Item book = room.findBook("1984");
        System.out.println(book.title); // Output: 1984

        List<String> books = room.listBooks();
        System.out.println(books); // Output: [Moby Dick, 1984]
    }
}