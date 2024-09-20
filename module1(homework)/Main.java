public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("A", "Aa", "9780451524935", 5);
        Book book2 = new Book("B", "Bb", "9780061120084", 3);
        Book book3 = new Book("C", "Cc", "9780743273565", 2);

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        library.removeBook(book2);

        Reader reader1 = new Reader("Alice", 1);
        Reader reader2 = new Reader("Bob", 2);

        library.addReader(reader1);
        library.addReader(reader2);


        library.giveOutBook("9780451524935");

        library.giveOutBook("9780743273565");

        library.giveOutBook("9780061120084");

        library.returnBook("9780451524935");


    }
}
