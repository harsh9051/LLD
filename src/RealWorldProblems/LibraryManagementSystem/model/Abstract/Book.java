package RealWorldProblems.LibraryManagementSystem.model.Abstract;

import RealWorldProblems.LibraryManagementSystem.Enum.BookFormat;
import RealWorldProblems.LibraryManagementSystem.model.Author;

import java.util.Date;

public abstract class Book {

    private String ISBN;
    private String title;
    private String Subject;
    private String publisher;
    private Date publicationDate;
    private String language;
    private int numberOfPages;
    private BookFormat format;
    private Author author;

    public Book(String ISBN, String title, String subject, int numberOfPages, BookFormat format, Author author, String publisher) {
        this.ISBN = ISBN;
        this.title = title;
        Subject = subject;
        this.numberOfPages = numberOfPages;
        this.format = format;
        this.author = author;
        this.publisher = publisher;
    }
}
