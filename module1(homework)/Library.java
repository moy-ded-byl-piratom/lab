import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;
    private ArrayList<Reader> readers;
    private ArrayList<Book> GiveOutBooks;
    public Library() {
        books = new ArrayList<>();
        readers = new ArrayList<>();
        GiveOutBooks = new ArrayList<>();
    }
    public void addBook(Book book) {
        books.add(book);
    }
    public void removeBook(Book book) {
        books.remove(book);
    }
    public void addReader(Reader reader) {
        readers.add(reader);
    }
    public void removeReader(Reader reader) {
        readers.remove(reader);
    }

    public void giveOutBook(String ISBN) {
        for (Book book : books) {
            if (book.getISBN().equals(ISBN) && book.getAmount() > 0) {
                GiveOutBooks.add(book);
                book.setAmount(book.getAmount() - 1);
                break;
            }
        }

    }
    public void returnBook(String ISBN) {
        for (Book book : GiveOutBooks) {
            if (book.getISBN().equals(ISBN)) {
                GiveOutBooks.remove(book);
                book.setAmount(book.getAmount() + 1);
                break;
            }
        }
    }
}
