package com.example.mylibrary;

import androidx.annotation.NonNull;

public class Book {

    private int id;
    private String judulBuku;
    private String author;
    private int pages;
    private String imageUrl;
    private String description;
    private String penerbit;
    private String tanggalTerbit;

    public Book(int id, String judulBuku, String author, int pages, String imageUrl, String description, String penerbit, String tanggalTerbit) {
        this.id = id;
        this.judulBuku = judulBuku;
        this.author = author;
        this.pages = pages;
        this.imageUrl = imageUrl;
        this.description = description;
        this.penerbit = penerbit;
        this.tanggalTerbit = tanggalTerbit;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getJudulBuku() {
        return judulBuku;
    }

    public void setJudulBuku(String judulBuku) {
        this.judulBuku = judulBuku;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }

    public String getTanggalTerbit() {
        return tanggalTerbit;
    }

    public void setTanggalTerbit(String tanggalTerbit) {
        this.tanggalTerbit = tanggalTerbit;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", judulBuku='" + judulBuku + '\'' +
                ", author='" + author + '\'' +
                ", pages=" + pages +
                ", imageUrl='" + imageUrl + '\'' +
                ", description='" + description + '\'' +
                ", penerbit='" + penerbit + '\'' +
                ", tanggalTerbit='" + tanggalTerbit + '\'' +
                '}';
    }

}
