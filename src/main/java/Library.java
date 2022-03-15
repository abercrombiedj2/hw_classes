import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books;
    private Integer capacity;

    public Library(){
        this.books = new ArrayList<>();
        this.capacity = 2;
    }

    public int bookCount(){
        return this.books.size();
    }

    public void addBook(Book book){
        if(this.bookCount() < this.capacity){
            this.books.add(book);
        }
    }

    public Book loanBook(){
        return this.books.remove(0);
    }
}
