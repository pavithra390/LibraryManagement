package com.example.bookservice.entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table
public class Book {
    @Id
    @Column
    Integer bookId;
    @Column
    String bookName;
    @Column
    String bookPrice;
    public Book() {}
    public Book(Integer bookId, String bookName, String bookPrice) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.bookPrice = bookPrice;}
    public Integer getBookId() {return bookId;}
    public void setBookId(Integer bookId) {this.bookId = bookId;}
    public String getBookName() {return bookName;}
    public void setBookName(String bookName) {this.bookName = bookName;}
    public String getBookPrice() {return bookPrice;}
    public void setBookPrice(String bookPrice) {this.bookPrice = bookPrice;}
}
