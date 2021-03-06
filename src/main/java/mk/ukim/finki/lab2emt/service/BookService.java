package mk.ukim.finki.lab2emt.service;

import mk.ukim.finki.lab2emt.model.Book;
import mk.ukim.finki.lab2emt.model.dto.BookDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface BookService {
    List<Book> findAll();

    Optional<Book> findById(Long id);

    Optional<Book> save(BookDto bookDto);

    Optional<Book> edit(Long id, BookDto bookDto);

    void deleteById(Long id);

    Page<Book> findAllByName(String name, Pageable pageable);
}
