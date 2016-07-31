package com.company.classes;

/**
 * Created by tkoleva on 07/27/16.
 */
public class Book {

    private String title;
    private String author;
    private String publisher;
    private String publishYear;
    private String isbn;

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setPublishYear(String publishYear) {
        this.publishYear = publishYear;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
