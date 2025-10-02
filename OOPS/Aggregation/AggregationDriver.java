
import java.util.ArrayList;

class Author {

    String name;

    Author(String name) {
        this.name = name;

    }

    public String AuthorInfo() {
        return name;
    }
}

class Book {

    private String name;
    private String type;
    private Author author;
    private double price;

    Book(String name, String type, Author author,
            double price) {
        this.name = name;
        this.type = type;
        this.author = author;
        this.price = price;
    }

    public void getBookInfo() {
        System.out.println("Book Info");
        System.out.println("name" + name);
        System.out.println("Type" + type);
        System.out.println("Price" + price);
        System.out.println("AUTHOR : " + author.AuthorInfo());
    }
}

class Librarian {

    private String name;
    private String address;
    private Long contact;

    public Librarian(String name, String address, Long contact) {
        this.name = name;
        this.address = address;
        this.contact = contact;
    }

    public void getLibrarianInfo() {
        System.out.println("Librarian Info");
        System.out.println("Name :" + name);
        System.out.println("Address" + address);
        System.out.println("Contact : " + contact);
    }

}

class Library {

    private String name;
    private String address;
    private Librarian librarian;
    private ArrayList<Book> listBooks = new ArrayList<Book>();

    public Library(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public void getLibraryInfo() {
        System.out.println("Library Info");
        System.out.println("Name: " + name);
        System.out.println("Address :" + address);
    }

    public void addLibrarian(Librarian librarian) {
        this.librarian = librarian;
    }

    public Librarian getLibrarian() {
        return librarian;
    }

    public void addBook(Book book) {
        listBooks.add(book);
    }

    public ArrayList<Book> getBookList() {
        return listBooks;
    }

}

public class AggregationDriver {

    public static void main(String[] args) {

        Library library = new Library("Dnyandeep", "polan peth");
        library.getLibrarian();

        Librarian librarian = new Librarian("Ramesh Kumar", "Pune", 457525L);

        library.addLibrarian(librarian);

        library.getLibrarian().getLibrarianInfo();

        Author author1 = new Author("James Gosling");
        Book book1 = new Book("JAVA", "Programming" ,
                author1, 12000);

        library.addBook(book1);

        Author author2 = new Author("Sane Guruji");
        Book book2 = new Book("sHYAM CHI aaI", "Story", author2, 500);

        library.addBook(book2);

        ArrayList<Book> list = new ArrayList<Book>();
        for (Book ele : list) {
            ele.getBookInfo();
        }

    }
}
