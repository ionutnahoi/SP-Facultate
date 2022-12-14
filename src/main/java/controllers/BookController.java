package controllers;

import lombok.SneakyThrows;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import repository.BookRepository;

import java.awt.print.Book;

public class BookController {

    private final BookRepository bookRepository;


    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @SneakyThrows
    @GetMapping("/{id}")
    public ResponseEntity<Book> getBook(@PathVariable Integer id) {
        Book book = bookRepository.getOne(id);
        return new ResponseEntity<>(book, HttpStatus.OK);
    }
}
