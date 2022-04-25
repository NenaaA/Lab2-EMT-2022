package mk.ukim.finki.lab2emt.service;

import mk.ukim.finki.lab2emt.model.Author;
import mk.ukim.finki.lab2emt.model.Book;
import mk.ukim.finki.lab2emt.model.enumerations.Category;

import java.util.List;
import java.util.Optional;

public interface BookService {
    List<Book> findAll();

    Optional<Book> findById(Long id);

    Optional<Book> save(String name, Category category, List<Author> authors, Integer availableCopies);

    Optional<Book> edit(Long id, String name, Category category, List<Author> authors, Integer availableCopies);

    void deleteById(Long id);
}
