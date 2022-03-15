import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Borrower borrower;
    private Library library;
    private Book book;

    @Before
    public void before(){
        borrower = new Borrower();
        library = new Library();
        book = new Book("Lord of the Rings", "Tolkien", "Fiction");
        library.addBook(book);
    }

    @Test
    public void canBorrowBookFromLibrary(){
        borrower.borrowBook(library);
        assertEquals(1, borrower.getCollection());
    }
}
