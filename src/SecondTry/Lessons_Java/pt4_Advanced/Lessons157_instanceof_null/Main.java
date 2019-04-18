package SecondTry.Lessons_Java.pt4_Advanced.Lessons157_instanceof_null;

/**
 * Created by user on 21.09.2018.
 */
public class Main {
    public static void main(String[] args) {
        new Object();
        Book x=new Book("one");
        Book y=new Book("one");
        Book z=new Book("one");

        //reflexive
        System.out.println("1   reflexive ");
        System.out.println(x.equals(x));//true
        System.out.println();

        //symmetric
        System.out.println("2   symmetric");
        System.out.println(x.equals(y));
        System.out.println(y.equals(x));
        System.out.println();

        //transitive
        System.out.println("3   transitive");
        System.out.println(x.equals(y));
        System.out.println(y.equals(z));
        System.out.println(x.equals(z));
        System.out.println();

        //consistent
        System.out.println("4   consistent");
        System.out.println(x.equals(y));
        System.out.println(x.equals(y));
        System.out.println(x.equals(y));
        System.out.println("");

    //not null
        System.out.println("5   not null");
        System.out.println(x.equals(null));
        System.out.println(null instanceof  Book);
}
}
class Book {
    String title;

    Book(String title) {
        this.title = title;
    }

/*    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        return title != null ? title.equals(book.title) : book.title == null;
    }*/

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Book) return this.title.equals(((Book) obj).title);
        return false;
    }
}