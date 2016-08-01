package com.company.classes;

import java.util.ArrayList;

/**
 * Created by tkoleva on 07/27/16.
 */
public class Library {

    private String name;

    private ArrayList<Book> bookList = new ArrayList<>();

    public ArrayList<Book> getBookList() {
        return bookList;
    }

    public void addBook(Book book){
        bookList.add(book);
    }

    public void testAddBook(){
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
            } else {
                System.out.println("There is no book with this author.");
            }
        }
    }

    public void printBookInfoByTitle(String title){
        for (Book book: bookList) {
            if(title.equals(book.getTitle())) {
                System.out.println("Book's info: ");
                System.out.println(book.getTitle());
                System.out.println(book.getAuthor());
                System.out.println(book.getPublisher());
                System.out.println(book.getPublishYear());
                System.out.println(book.getIsbn());
            } else {
                System.out.println("There is no book with this title.");}
        }
    }

    public void printBookInfo(Book book){
        for (Book foundBook: bookList) {
            System.out.println("Book's info: ");
            System.out.println(foundBook.getTitle());
            System.out.println(foundBook.getAuthor());
            System.out.println(foundBook.getPublisher());
            System.out.println(foundBook.getPublishYear());
            System.out.println(foundBook.getIsbn());
            System.out.println();
        }
    }

    public void removeBookByTitle(String title){
        if (bookList.size() > 0 && bookList.size() !=1){
            for (Book book: bookList) {
                if(title.equals(book.getTitle())) {
                    bookList.remove(book);
                    System.out.println("Removed book: " + book.getTitle());
                } else {
                    System.out.println("There is no book with this title.");
                }
            }
        } else if(bookList.size() == 1){
            System.out.println("Removed book: " + bookList.get(0).getTitle());
            bookList.remove(bookList.get(0));
        }
        else {
            System.out.println("There are no books in your list.");
        }
    }
}