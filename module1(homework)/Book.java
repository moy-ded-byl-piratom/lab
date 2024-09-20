import java.util.ArrayList;
public class Book {
    private String title;
    private String author;
    private String ISBN;
    private int amount;

    public Book(String title, String author, String ISBN, int amount) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.amount = amount;
    }

    public String getISBN() {
        return ISBN;
    }

    public int getAmount() {
        return amount;
    }
    public void setAmount(int amount){
        this.amount = amount;
    }


}



