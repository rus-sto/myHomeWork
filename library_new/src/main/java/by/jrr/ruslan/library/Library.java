package by.jrr.ruslan.library;

import java.util.ArrayList;
import java.util.List;

public class Library implements LibraryInter {
    List<Book> myBookList = new ArrayList<>();

    public List<Book> getMyBookList() {
        return myBookList;
    }

    @Override
    public void addBookToLibrary(Book book) {
        myBookList.add(book);
    }

    @Override
    public void deleteBookFromLibrary(Book book) {
        myBookList.remove(book);
    }

    @Override
    public Book findBookByName(String bookName) {
        for (Book book : myBookList) {
            if (book.getBookName().equals(bookName)) {
                return book;
            }
        }
        return null;
    }

    @Override
    public List<Book> findBooksByAuthor(String author) {
        List<Book> booksByTheAuthor = new ArrayList<>();
        for (Book book : myBookList) {
            if (book.getAuthor().equals(author)) {
                booksByTheAuthor.add(book);
            }
        }
        return booksByTheAuthor;
    }

    public void printMyLibrary() {
        for (Book book : myBookList) {
            App.logger.info("{}", book);
        }
    }
}
