package mk.ukim.finki.lab2emt.repository;

import mk.ukim.finki.lab2emt.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface AuthorRepository extends JpaRepository<Author, Long> {
    List<Author> findAllById(List<Long> authors);
}
