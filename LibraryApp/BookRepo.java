package libApp;

import java.util.ArrayList;

public class BookRepo {
    private ArrayList<Book> books = new ArrayList<>();

    public BookRepo()
    {
        Book book1 = new Book("894393", "The Dead of Night", "none", "Horror", "S.K. Eleton", 10, 7);
        Book book2 = new Book("399399", "The Knight", "none", "Mystery", "Norma Dran", 2, 1);
        Book book3 = new Book("934939", "Flowers of tomorrow", "none", "Self-Help", "John Crow", 5, 3);
        Book book4 = new Book("434939", "Flowers for the Knight", "none", "Novel", "John Yeaf", 20, 14);
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
    }
    public Book findByIsbn(String isbn)
    {
        for(Book book: books)
        {
            if(book.getIsbn().equals(isbn))
            {
                return book;
            }
        }
        return null;
    }
    public ArrayList<Book> findByTitle(String keyword)
    {
        ArrayList<Book> booksFound = new ArrayList<>();
        for(Book book: books)
        {
            if(book.getTitle().contains(keyword))
            {
                booksFound.add(book);
            }
        }
        return booksFound;
    }
}
