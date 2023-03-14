package org.library.java;

import java.util.Scanner;

public class Main {

//    Quando vengono inseriti i dati, verificare che siano corretti (es. non accettare titolo o autore o editore vuoto, numero pagine ≤ 0).
//    Se ci sono errori, lanciare un’eccezione e gestirla mostrando a video il tipo di errore.
//    Implementare i getter e setter di tutti gli attributi del libro gestendo anche in questo caso eventuali errori di dati non corretti
//            (che generano quindi eccezione).
//
//    Al termine dell’inserimento scrivere tutti i dati dei libri in un file e in seguito rileggerli dal file e mostrarli a video.
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Quanti libri vuoi inserire?");
        int book_length = scan.nextInt();
        Book[] books = new Book[book_length];

        for (int i = 0; i < book_length; i++) {
            System.out.print("Inserisci titolo: ");
            String title = scan.next();

            System.out.print("Inserisci numero di pagine: ");
            int pages = scan.nextInt();


            System.out.print("Inserisci autore: ");
            String author = scan.next();


            System.out.print("Inserisci editore: ");
            String publisher = scan.next();

            Book newBook = new Book(title, pages, author, publisher);
            books[i] = newBook;

        }


    }
}
