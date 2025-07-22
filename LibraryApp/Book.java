package libApp;

public class Book {
    private String isbn;
    private String title;
    private String genre;
    private String desc;
    private String author;
    private int quantity;
    private int numCheckedOut;

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public String getDesc() {
        return desc;
    }

    public String getAuthor() {
        return author;
    }

    public int getNumCheckedOut() {
        return numCheckedOut;
    }

    public int getQuantity() {
        return quantity;
    }
    public void checkOut(){
        numCheckedOut++;
    }
    public void checkIn(){
        numCheckedOut--;
    }
//constructor

    public Book(String isbn, String title, String desc, String genre, String author, int quantity, int numCheckedOut) {
        this.author = author;
        this.isbn = isbn;
        this.title = title;
        this.genre = genre;
        this.desc = desc;
        this.quantity = quantity;
        this.numCheckedOut = numCheckedOut;
    }
}
