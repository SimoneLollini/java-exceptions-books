package org.library.java;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
//    Se ci sono errori, lanciare un’eccezione e gestirla mostrando a video il tipo di errore.
//    Implementare i getter e setter di tutti gli attributi del libro gestendo anche in questo caso eventuali errori di dati non corretti
//            (che generano quindi eccezione).
//
//    Al termine dell’inserimento scrivere tutti i dati dei libri in un file e in seguito rileggerli dal file e mostrarli a video.
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Quanti libri vuoi inserire?");
        int book_length = Integer.parseInt(scan.nextLine());
        Book[] books = new Book[book_length];

        for (int i = 0; i < books.length; i++) {
            System.out.print("Inserisci titolo: ");
            String title = scan.nextLine();

            System.out.print("Inserisci numero di pagine: ");
            int pages = Integer.parseInt(scan.nextLine());


            System.out.print("Inserisci autore: ");
            String author = scan.nextLine();


            System.out.print("Inserisci editore: ");
            String publisher = scan.nextLine();


            Book newBook = null;
            try {
                newBook = new Book(title, pages, author, publisher);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
            books[i] = newBook;
        }
        scan.close();
        //Al termine dell’inserimento scrivere tutti i dati dei libri in un file

        /********* scrittura **********/
        String filePath = "./books-list.txt";
        try {
            FileWriter newFile = new FileWriter("books-list.txt",true);
            for (int i = 0; i <books.length; i++) {
                assert books[i] != null;
                newFile.write( books[i].toString()  + "\n");
            }
            newFile.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.getMessage();
        }



        /********* lettura **********/
        Scanner fileScan = null;
        try {
            fileScan = new Scanner(new File(filePath));
            while (fileScan.hasNext()) {
                String line = fileScan.nextLine();
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            if (fileScan != null) {
                try {
                    fileScan.close();
                } catch (IllegalStateException ise) {
                    ise.printStackTrace();
                }
            }
        }
    }
}
