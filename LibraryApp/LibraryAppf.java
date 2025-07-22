package libApp;

import java.util.ArrayList;

public class LibraryAppf {
    private BookRepo brepo = new BookRepo();

    public void searchBy(String isbn){
        System.out.printf("Searching for books with ISBN %s...\t", isbn);
        Book book = brepo.findByIsbn(isbn);
        if(book != null)
        {
            System.out.printf("\n1 book found: \n\tTitle: %s", book.getTitle());
        }
        else{
            System.out.println("\n0 books found");
        }
    }
    public void searchByTitle(String keyword)
    {
        System.out.printf("Searching for books with %s in the title...\n", keyword);
        ArrayList<Book> books = brepo.findByTitle(keyword);
        if(!books.isEmpty()) {
            System.out.println(books.size() + " book(s) found. Here is/are the book(s): \n");
        }
        else{
            System.out.println("0 books found.");
        }
        for(Book book : books) {
            System.out.printf("Title: %s\n", book.getTitle());
            System.out.printf("Author: %s\n", book.getAuthor());
            System.out.println("----------------------------");
        }

    }

    public void checkOutBook(String isbn)
    {
        Book book = brepo.findByIsbn(isbn);
        if(book != null)
        {
            book.checkOut();
            System.out.println("Book successfully checked out!");
            System.out.printf("Title: %s\n", book.getTitle());
        }
        else{
            System.out.println("Failed to checkout book.");
            System.out.printf("There is no book with ISBN %s on record.\n", isbn);
        }
        System.out.println("------");
    }
    public void checkInBook(String isbn)
    {
        Book book = brepo.findByIsbn(isbn);
        if(book != null)
        {
            book.checkIn();
            System.out.println("Book successfully checked in!");
            System.out.printf("Title: %s\n", book.getTitle());
        }
        else{
            System.out.println("Failed to checkin book.");
            System.out.printf("There is no book with ISBN %s on record.\n", isbn);
        }
        System.out.println("------");
    }
}
