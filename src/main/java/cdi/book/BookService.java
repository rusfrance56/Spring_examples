package cdi.book;

import cdi.generator.NumberGenerator;
import cdi.qualifiers.Loggable;
import cdi.qualifiers.ThirteenDigits;

import javax.inject.Inject;

@Loggable
public class BookService {

    @Inject @ThirteenDigits
    private NumberGenerator numberGenerator;

    public Book createBook(String title, Float price, String description) {
        Book book = new Book(title, price, description);
        book.setNumber(numberGenerator.generateNumber());
        return book;
    }

}