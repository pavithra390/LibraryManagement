package com.example.bookservice.service;
import com.example.bookservice.entity.Book;
import com.example.bookservice.repo.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BookService {
    @Autowired
    BookRepo bookRepo;
    public void addingBook(Book book) {
        bookRepo.save(book);
    }
    public Optional<Book> getBookById(Integer bookId) {
        return bookRepo.findById(bookId);
    }
    public Iterable<Book> getAllBooks() {
        return bookRepo.findAll();
    }
    public void deleteBookById(Integer bookId) {
        bookRepo.deleteById(bookId);
    }
    public void deleteAllBooks() {
        bookRepo.deleteAll();
    }
}
