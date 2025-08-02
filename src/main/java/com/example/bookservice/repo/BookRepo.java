package com.example.bookservice.repo;
import com.example.bookservice.entity.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepo extends CrudRepository<Book, Integer> {
}
