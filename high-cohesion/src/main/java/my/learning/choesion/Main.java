package my.learning.choesion;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        OrganizedRoom room = new OrganizedRoom();
        room.addBook("Fiction", new Book("Moby Dick", "Herman Melville"));
        room.addBook("Science Fiction", new Book("1984", "George Orwell"));

        Book book = room.findBook("Science Fiction", "1984");
        System.out.println(book.title);

        List<String> books = room.listBooksByCategory("Fiction");
        System.out.println(books);
    }
}