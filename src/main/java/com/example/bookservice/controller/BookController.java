package com.example.bookservice.controller;
import com.example.bookservice.entity.Book;
import com.example.bookservice.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class BookController {
    @Autowired
    private BookService bookService;

    @PostMapping("/addingBook")
    //http://localhost:3333/addingBook
    public String addingBook(@RequestBody Book book) {
        bookService.addingBook(book);
        return "Book stored Successfully";
    }

    @GetMapping("/provider/gettingBook/{book_id}")
    //http://localhost:3333/provider/gettingBook/7
    public Optional<Book> getBookById(@PathVariable("book_id") Integer book_id) {
        return bookService.getBookById(book_id);
    }

    @GetMapping("/provider/gettingAllBooks")
    //http://localhost:3333/provider/gettingAllBooks
    public Iterable<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    @DeleteMapping("/provider/deleteBook/{boo_id}")
    //http://localhost:3333/provider/deleteBook/111
    public String deleteBook(@PathVariable("boo_id") Integer book_id) {
        bookService.deleteBookById(book_id);
        return "Book Deleted Successfully";
    }
    @DeleteMapping("/provider/deleteAllBooks")
    //http://localhost:3333/provider/deleteAllBooks
    public String deleteAllBooks() {
        bookService.deleteAllBooks();
        return "All Books Deleted Successfully";
    }
}

