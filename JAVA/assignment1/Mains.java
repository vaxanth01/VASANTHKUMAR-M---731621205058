package assignment;

import java.util.ArrayList;
import java.util.List;

class Book {
    private String title;
    private String author;
    private String ISBN;

    // Constructor
    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    // Getters and setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", ISBN='" + ISBN + '\'' +
                '}';
    }
}

class Library {
    private List<Book> collection;

    // Constructor
    public Library() {
        this.collection = new ArrayList<>();
    }

    // Method to add a book to the collection
    public void addBook(Book book) {
        collection.add(book);
        System.out.println("Book added: " + book);
    }

    // Method to remove a book from the collection by ISBN
    public void removeBook(String ISBN) {
        for (Book book : collection) {
            if (book.getISBN().equals(ISBN)) {
                collection.remove(book);
                System.out.println("Book removed: " + book);
                return;
            }
        }
        System.out.println("Book with ISBN " + ISBN + " not found.");
    }

    // Method to display all books in the collection
    public void displayBooks() {
        if (collection.isEmpty()) {
            System.out.println("No books in the collection.");
        } else {
            for (Book book : collection) {
                System.out.println(book);
            }
        }
    }
}

public class Mains {
    public static void main(String[] args) {
        Library library = new Library();

        // Create some book instances
        Book book1 = new Book("To Kill a Mockingbird", "Harper Lee", "9780060935467");
        Book book2 = new Book("1984", "George Orwell", "9780451524935");
        Book book3 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "9780743273565");

        // Add books to the library
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        // Display all books
        System.out.println("\nAll books in the library:");
        library.displayBooks();

        // Remove a book by ISBN
        System.out.println("\nRemoving book with ISBN 9780451524935:");
        library.removeBook("9780451524935");

        // Display all books after removal
        System.out.println("\nAll books in the library after removal:");
        library.displayBooks();
    }
}
