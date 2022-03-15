import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book;
    private Book book2;
    private Book book3;

    @Before
    public void before(){
        library = new Library();
        book = new Book("Lord of the Rings", "Tolkien", "Fiction");
        book2 = new Book("Fifty Shades of Grey", "E.L. James", "Fiction");
        book3 = new Book("To Kill a Mockingbird", "Harper Lee", "Fiction");
    }

    @Test
    public void startsWithNoBooks(){
        assertEquals(0, library.bookCount());
    }

    @Test
    public void canAddBookToLibrary(){
        library.addBook(book);
        assertEquals(1, library.bookCount());
    }

    @Test
    public void cantAddBookAtCapacity(){
        library.addBook(book);
        library.addBook(book2);
        library.addBook(book3);
        assertEquals(2, library.bookCount());
    }


}
