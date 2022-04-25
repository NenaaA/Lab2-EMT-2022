package mk.ukim.finki.lab2emt.service.impl;

import mk.ukim.finki.lab2emt.model.Author;
import mk.ukim.finki.lab2emt.model.Book;
import mk.ukim.finki.lab2emt.model.dto.BookDto;
import mk.ukim.finki.lab2emt.model.enumerations.Category;
import mk.ukim.finki.lab2emt.model.exception.BookNotFoundException;
import mk.ukim.finki.lab2emt.model.exception.CategoryNotFoundException;
import mk.ukim.finki.lab2emt.repository.AuthorRepository;
import mk.ukim.finki.lab2emt.repository.BookRepository;
import mk.ukim.finki.lab2emt.repository.CategoryRepository;
import mk.ukim.finki.lab2emt.service.BookService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;
    private final CategoryRepository categoryRepository;
    private final AuthorRepository authorRepository;

    public BookServiceImpl(BookRepository bookRepository, CategoryRepository categoryRepository, AuthorRepository authorRepository) {
        this.bookRepository = bookRepository;
        this.categoryRepository = categoryRepository;
        this.authorRepository = authorRepository;
    }

    @Override
    public List<Book> findAll() {
        return this.bookRepository.findAll();
    }

    @Override
    public Optional<Book> findById(Long id) {
        return this.bookRepository.findById(id);
    }

    @Override
    public Optional<Book> save(BookDto bookDto) {
        Category category = this.categoryRepository.findById(bookDto.getCategory())
                .orElseThrow(() -> new CategoryNotFoundException(bookDto.getCategory()));
        List<Author> authors = this.authorRepository.findAllById(bookDto.getAuthors());

        return Optional.of(this.bookRepository.save(new Book(bookDto.getName(), category, authors, bookDto.getAvailableCopies())));
    }

    @Override
    public Optional<Book> edit(Long id, BookDto bookDto) {
        Book book = this.bookRepository.findById(id).orElseThrow(() -> new BookNotFoundException(id));

        book.setName(bookDto.getName());
        book.setAvailableCopies(bookDto.getAvailableCopies());

        Category category = this.categoryRepository.findById(bookDto.getCategory())
                .orElseThrow(() -> new CategoryNotFoundException(bookDto.getCategory()));
        book.setCategory(category);

        List<Author> authors = this.authorRepository.findAllById(bookDto.getAuthors());
        book.setAuthors(authors);

        return Optional.of(this.bookRepository.save(book));
    }

    @Override
    public void deleteById(Long id) {
        this.bookRepository.deleteById(id);
    }

    @Override
    public Page<Book> findAllByName(String name, Pageable pageable) {
        return null;
    }
}
