package com.example.mylibrary;

import java.util.ArrayList;
import java.util.Date;

public class Util {

    private static ArrayList<Book> allBooks;
    private static ArrayList<Book> currentlyReadingBooks;
    private static ArrayList<Book> wantToReadBooks;
    private static ArrayList<Book> alreadyReadBooks;

    private static int id = 0;

    public Util(){

        if(allBooks == null){
            allBooks = new ArrayList<>();
            initAllBooks();
        }

        if(currentlyReadingBooks == null){
            currentlyReadingBooks = new ArrayList<>();
        }

        if(null == wantToReadBooks){
            wantToReadBooks = new ArrayList<>();
        }

        if(null == alreadyReadBooks){
            alreadyReadBooks = new ArrayList<>();
        }

    }

    public static void initAllBooks(){

        int id = 0;
        String titleBook = "";
        String authorBook = "";
        int pagesBook = 0;
        String imageUrlBook= "";
        String descBook = "";
        String penerbit = "";
        String tanggalTerbit = "";
        int jumlahHalamanBuku = 0;

        id++;
        titleBook = "Nudge: Improving Decisions About Health, Wealth, and Happiness";
        authorBook = "Richard H. Thaler, Cass R. Sunstein";
        pagesBook = 260;
        imageUrlBook = "https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1348322381l/3450744.jpg";
        descBook = "Every day we make choices—about what to buy or eat, about financial investments or our children’s " +
                "health and education, even about the causes we champion or the planet itself.";
        penerbit = "Seal Books";
        tanggalTerbit = "29 Agustus 2006";
        allBooks.add(new Book(id, titleBook, authorBook, pagesBook, imageUrlBook, descBook, penerbit, tanggalTerbit));

        id++;
        titleBook = "Predictably Irrational: The Hidden Forces That Shape Our Decisions";
        authorBook = "Richard H. Thaler, Cass R. Sunstein";
        pagesBook = 260;
        imageUrlBook = "https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1255573980l/1713426.jpg";
        descBook = "Every day we make choices—about what to buy or eat, about financial investments or our children’s " +
                "health and education, even about the causes we champion or the planet itself.";
        penerbit = "Seal Books";
        tanggalTerbit = "29 Agustus 2006";
        allBooks.add(new Book(id, titleBook, authorBook, pagesBook, imageUrlBook, descBook, penerbit, tanggalTerbit));

        id++;
        titleBook = "Thinking, Fast and Slow";
        authorBook = "Richard H. Thaler, Cass R. Sunstein";
        pagesBook = 260;
        imageUrlBook = "https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1317793965l/11468377.jpg";
        descBook = "Every day we make choices—about what to buy or eat, about financial investments or our children’s " +
                "health and education, even about the causes we champion or the planet itself.";
        penerbit = "Seal Books";
        tanggalTerbit = "29 Agustus 2006";
        allBooks.add(new Book(id, titleBook, authorBook, pagesBook, imageUrlBook, descBook, penerbit, tanggalTerbit));

        id++;
        titleBook = "Nudge: Improving Decisions About Health, Wealth, and Happiness";
        authorBook = "Richard H. Thaler, Cass R. Sunstein";
        pagesBook = 260;
        imageUrlBook = "https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1348322381l/3450744.jpg";
        descBook = "Every day we make choices—about what to buy or eat, about financial investments or our children’s " +
                "health and education, even about the causes we champion or the planet itself.";
        penerbit = "Seal Books";
        tanggalTerbit = "29 Agustus 2006";
        allBooks.add(new Book(id, titleBook, authorBook, pagesBook, imageUrlBook, descBook, penerbit, tanggalTerbit));

        id++;
        titleBook = "How to Win Friends and Influence People";
        authorBook = "Richard H. Thaler, Cass R. Sunstein";
        pagesBook = 260;
        imageUrlBook = "https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1442726934l/4865._SY475_.jpg";
        descBook = "Every day we make choices—about what to buy or eat, about financial investments or our children’s " +
                "health and education, even about the causes we champion or the planet itself.";
        penerbit = "Seal Books";
        tanggalTerbit = "29 Agustus 2006";
        allBooks.add(new Book(id, titleBook, authorBook, pagesBook, imageUrlBook, descBook, penerbit, tanggalTerbit));

        id++;
        titleBook = "How to Win Friends and Influence People";
        authorBook = "Richard H. Thaler, Cass R. Sunstein";
        pagesBook = 260;
        imageUrlBook = "https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1442726934l/4865._SY475_.jpg";
        descBook = "Every day we make choices—about what to buy or eat, about financial investments or our children’s " +
                "health and education, even about the causes we champion or the planet itself.";
        penerbit = "Seal Books";
        tanggalTerbit = "29 Agustus 2006";
        allBooks.add(new Book(id, titleBook, authorBook, pagesBook, imageUrlBook, descBook, penerbit, tanggalTerbit));

        id++;
        titleBook = "How to Win Friends and Influence People";
        authorBook = "Richard H. Thaler, Cass R. Sunstein";
        pagesBook = 260;
        imageUrlBook = "https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1442726934l/4865._SY475_.jpg";
        descBook = "Every day we make choices—about what to buy or eat, about financial investments or our children’s " +
                "health and education, even about the causes we champion or the planet itself.";
        penerbit = "Seal Books";
        tanggalTerbit = "29 Agustus 2006";
        allBooks.add(new Book(id, titleBook, authorBook, pagesBook, imageUrlBook, descBook, penerbit, tanggalTerbit));

        id++;
        titleBook = "How to Win Friends and Influence People";
        authorBook = "Richard H. Thaler, Cass R. Sunstein";
        pagesBook = 260;
        imageUrlBook = "https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1442726934l/4865._SY475_.jpg";
        descBook = "Every day we make choices—about what to buy or eat, about financial investments or our children’s " +
                "health and education, even about the causes we champion or the planet itself.";
        penerbit = "Seal Books";
        tanggalTerbit = "29 Agustus 2006";
        allBooks.add(new Book(id, titleBook, authorBook, pagesBook, imageUrlBook, descBook, penerbit, tanggalTerbit));

    }

    public static ArrayList<Book> getAllBooks() {
        return allBooks;
    }

    public static ArrayList<Book> getCurrentlyReadingBooks() {
        return currentlyReadingBooks;
    }

    public static ArrayList<Book> getWantToReadBooks() {
        return wantToReadBooks;
    }

    public static ArrayList<Book> getAlreadyReadBooks() {
        return alreadyReadBooks;
    }

    public boolean addCurrentlyReadingBook(Book book){
        return currentlyReadingBooks.add(book);
    }

    public boolean addWantToReadBooks(Book book){
        return wantToReadBooks.add(book);
    }

    public boolean addAlreadyReadBooks(Book book){
        return alreadyReadBooks.add(book);
    }

    public boolean removeCurrentlyReadingBook(Book book){
        return currentlyReadingBooks.remove(book);
    }

    public boolean removeWantToReadBooks(Book book){
        return wantToReadBooks.remove(book);
    }

    public boolean removeAlreadyTeadBooks(Book book){
        return alreadyReadBooks.remove(book);
    }

}
