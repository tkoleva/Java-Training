package com.company.classes;

import java.util.ArrayList;

/**
 * Created by tkoleva on 07/27/16.
 */
public class Library {

    private String name;
    private ArrayList<Book> bookList = new ArrayList<>();

    public void addBook(Book book){
        bookList.add(book);
    }

    public void testAddCall(){
        Book newBook = new Book();
        bookList.add(newBook);
        newBook.setAuthor("Sir Terry Pratchett");
        newBook.setIsbn("0-43534-234234-34564-345-0");
        newBook.setPublisher("Transworld Publishers");
        newBook.setPublishYear("1999");
        newBook.setTitle("The fifth elephant");

        System.out.println(bookList.size());
    }

    public void findBookByAuthor(String author){
        for (Book book: bookList) {
            if(author.equals(book.getAuthor())){
                System.out.println("The book you are looking for is: " + book.getTitle());
            }
        }
    }
}