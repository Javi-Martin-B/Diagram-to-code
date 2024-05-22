public class Patron {
    public Book getBook(String title) {

        Book book = new Book(title);
        return book;
    }
}