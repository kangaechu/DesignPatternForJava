package iterator;

import java.util.Vector;

public class BookShelf implements Aggregate {
    private Vector<Book> books;
    private int last = 0;

    public BookShelf() {
        this.books = new Vector<>();
    }

    public Book getBookAt(int index) {
        return books.elementAt(index);
    }

    public void appendBook(Book book) {
        this.books.add(book);
    }

    public int getLength() {
        return this.books.size();
    }

    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
