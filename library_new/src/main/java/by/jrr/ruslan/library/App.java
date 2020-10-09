package by.jrr.ruslan.library;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class App {
    public static final Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        Library library = new Library();
        library.getMyBookList().addAll(
                List.of(
                        new Book("Twen", "Tom Soyer100"),
                        new Book("Twen", "HackelberryFin100"))
        );
        library.printMyLibrary();

    }
}
