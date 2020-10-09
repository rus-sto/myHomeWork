package by.jrr.ruslan.library;

import java.util.List;

public interface LibraryInter {
    void addBookToLibrary(Book book);

    void deleteBookFromLibrary(Book book);

    Book findBookByName(String bookName);

    List<Book> findBooksByAuthor(String author);
}
