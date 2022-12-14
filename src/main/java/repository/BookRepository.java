package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.awt.print.Book;

@Repository
public abstract class BookRepository implements JpaRepository<Book, Integer> {

}
