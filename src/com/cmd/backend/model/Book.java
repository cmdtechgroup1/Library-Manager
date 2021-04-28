package com.cmd.backend.model;

public class Book {

   private final int id;
   private final String title;
   private final String author;
   private final String bookId;
   private final String publisher;

    public Book(int id, String title, String author, String bookId, String publisher) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.bookId = bookId;
        this.publisher = publisher;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getBookId() {
        return bookId;
    }

    public String getPublisher() {
        return publisher;
    }

}
