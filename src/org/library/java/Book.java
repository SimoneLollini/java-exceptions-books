package org.library.java;
//        Consegna: Vogliamo gestire il catalogo di libri di una biblioteca.
//        Un libro è composto da :
//        - titolo
//        - numero pagine
//        - autore
//        - editore
//        Scrivere un programma che inserisce n libri in un array.
//        Chiede i dati di un libro (titolo, numero pagine, autore, editore),
//        istanzia un nuovo oggetto della classe Book e lo inserisce nell’array.
//        Lo fa per il numero di elementi previsti nell’array.
public class Book {

    String title;
    int pages;
    String author;
    String publisher;

    public Book(String title, int pages, String author, String publisher) {
        this.title = title;
        this.pages = pages;
        this.author = author;
        this.publisher = publisher;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}
