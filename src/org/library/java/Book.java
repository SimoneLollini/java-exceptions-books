package org.library.java;
public class Book {

    String title;
    int pages;
    String author;
    String publisher;

    public Book(String title, int pages, String author, String publisher) throws IllegalArgumentException {

        isFieldValid(title,"titolo");
        isFieldValid(author,"autore");
        isFieldValid(publisher,"editore");

        isNumValid(pages);


        this.title = title;
        this.pages = pages;
        this.author = author;
        this.publisher = publisher;
    }



    private void isFieldValid(String str, String field) throws IllegalArgumentException {

        if (str.isBlank())
            throw new IllegalArgumentException("Campo " + field + " non valido");
    }

    private void isNumValid(int pages) throws IllegalArgumentException{
        if (pages < 1)
            throw new IllegalArgumentException("Il numero delle pagine deve essere un intero superiore ad 1");
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        isFieldValid(title, "titolo");
        this.title = title;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        isNumValid(pages);
        this.pages = pages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        isFieldValid(author, "autore");
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        isFieldValid(publisher,"editore");
        this.publisher = publisher;
    }
}
