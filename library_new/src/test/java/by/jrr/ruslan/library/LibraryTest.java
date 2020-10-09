package by.jrr.ruslan.library;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import java.util.List;

import static org.junit.Assert.*;

public class LibraryTest {
    Book bookThee;
    Book bookFour;
    Library library;

    @Before
    public void setUp() {
        Book bookOne = new Book("Exuperi", "Little Prince");
        bookThee = new Book("Twen", "Tom Soyer");
        bookFour = new Book("Twen", "HackelberryFin");
        library = new Library();

        library.addBookToLibrary(bookOne);
        library.addBookToLibrary(new Book("Nosov", "Neznayka"));
        library.addBookToLibrary(bookThee);
        library.addBookToLibrary(bookFour);

    }

    @Test
    public void addBookToLibrary() {
        assertEquals(4, library.myBookList.size());
    }

    @Test
    public void deleteBookFromLibrary() {
        library.deleteBookFromLibrary(new Book("Nosov", "Neznayka"));
        assertEquals(3, library.myBookList.size());
    }

    @Test
    public void findBookByName() {
        Book expectedBook = new Book("Nosov", "Neznayka");
        Book actualBook = library.findBookByName("Neznayka");
        assertEquals(expectedBook, actualBook);
    }


    @Test
    public void findBooksByAuthorAll() {
        List<Book> expectedBook = new ArrayList<>();
        expectedBook.add(bookThee);
        expectedBook.add(bookFour);
        List<Book> actualBook = ((library.findBooksByAuthor("Twen")));

        assertEquals(expectedBook, actualBook);
    }
}
