package SecondTry.Lessons_Java.pt1_Beginner.Lessons49_equals_HashCode;

import java.util.HashMap;
import java.util.Map;

public class Main extends Object {
    public static void main(String[] args) {
        Ticket ticket=new Ticket();
        ticket.number=122;
        Book book = new Book();
        book.autor="Shildt";
        book.name="Java 8 programming";
        Map<Ticket, Book> Library = new HashMap<>();
        Library.put(ticket,book);

        Ticket ticket2=new Ticket();
        ticket2.number=122;


        Book shildtBook=Library.get(ticket2);
        System.out.println(shildtBook.autor);
    }
}

class Book {
    String autor;
    String name;
}
class Ticket{
    int number;
    String LibraryName;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Ticket ticket = (Ticket) o;

        if (this.number != ticket.number) return false;
        return LibraryName != null ? LibraryName.equals(ticket.LibraryName) : ticket.LibraryName == null;
    }

    @Override
    public int hashCode() {
        int result = number;
        result = 31 * result + (LibraryName != null ? LibraryName.hashCode() : 0);
        return result;
    }
}