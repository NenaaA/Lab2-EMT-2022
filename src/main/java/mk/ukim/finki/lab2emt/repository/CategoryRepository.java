package mk.ukim.finki.lab2emt.repository;

import mk.ukim.finki.lab2emt.model.enumerations.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
