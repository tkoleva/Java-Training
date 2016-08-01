package com.company.classes;

/**
 * Created by tkoleva on 07/31/16.
 */
public class LibraryTest {
    Library library = new Library();

    public void addBooksToLibrary(){
        Book skThirdBook = new Book();
        library.getBookList().add(skThirdBook);
        skThirdBook.setAuthor("Stephen King");
        skThirdBook.setIsbn("978-0-385-12167-5");
        skThirdBook.setPublisher("Doubleday");
        skThirdBook.setPublishYear("1977");
        skThirdBook.setTitle("The Shining");

        Book firstBook = new Book();
        library.getBookList().add(firstBook);
        firstBook.setAuthor("Sir Terry Pratchett");
        firstBook.setIsbn("0-43534-234234-34564-345-0");
        firstBook.setPublisher("Transworld Publishers");
        firstBook.setPublishYear("1999");
        firstBook.setTitle("The fifth elephant");

        Book secondBook = new Book();
        library.getBookList().add(secondBook);
        secondBook.setAuthor("Sir Terry Pratchett");
        secondBook.setIsbn("1-67564-23123-34540343-0");
        secondBook.setPublisher("The Orion Publishing Group Ltd.");
        secondBook.setPublishYear("1988");
        secondBook.setTitle("Wyrd Sisters");

        Book thirdBook = new Book();
        library.getBookList().add(thirdBook);
        thirdBook.setAuthor("Sir Terry Pratchett");
        thirdBook.setIsbn("1-342-4567850-3530-242");
        thirdBook.setPublisher("Victor Gollancz Ltd.");
        thirdBook.setPublishYear("1989");
        thirdBook.setTitle("Pyramids");

        Book fourthBook = new Book();
        library.getBookList().add(fourthBook);
        fourthBook.setAuthor("Sir Terry Pratchett");
        fourthBook.setIsbn("0-34534-0008456-34535-123");
        fourthBook.setPublisher("The Orion Publishing Group Ltd.");
        fourthBook.setPublishYear("1988");
        fourthBook.setTitle("Sourcery");

        Book fifthBook = new Book();
        library.getBookList().add(fifthBook);
        fifthBook.setAuthor("Sir Terry Pratchett");
        fifthBook.setIsbn("0-353424-64560923-23536-24");
        fifthBook.setPublisher("The Orion Publishing Group Ltd.");
        fifthBook.setPublishYear("1987");
        fifthBook.setTitle("Mort");

        Book skFirstBook = new Book();
        library.getBookList().add(skFirstBook);
        skFirstBook.setAuthor("Stephen King");
        skFirstBook.setIsbn("0385086954");
        skFirstBook.setPublisher("Doubleday");
        skFirstBook.setPublishYear("1974");
        skFirstBook.setTitle("Carrie");

        Book skSecondBook = new Book();
        library.getBookList().add(skSecondBook);
        skSecondBook.setAuthor("Stephen King");
        skSecondBook.setIsbn("978-0-385-00751-1");
        skSecondBook.setPublisher("Doubleday");
        skSecondBook.setPublishYear("1975");
        skSecondBook.setTitle("Salem's Lot");

        System.out.println(library.getBookList().size());
    }

    public void printBooksFromLibrary(){
        int i = 0;
        library.printBookInfo(library.getBookList().get(i));
        i++;
    }

    public void findAndDeleteBookByAuthor(String author){
        int bookListSize = library.getBookList().size();
        for (int i = bookListSize - 1; i >= 0; i--) {
            if(author.equals(library.getBookList().get(i).getAuthor())){
                System.out.println("The book you are looking for is: " + library.getBookList().get(i).getTitle());
                library.getBookList().remove(library.getBookList().get(i));
                bookListSize--;
            }
        }
    }
}
