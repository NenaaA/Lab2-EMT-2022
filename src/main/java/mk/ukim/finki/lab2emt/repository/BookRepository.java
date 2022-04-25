package mk.ukim.finki.lab2emt.repository;

import mk.ukim.finki.lab2emt.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
