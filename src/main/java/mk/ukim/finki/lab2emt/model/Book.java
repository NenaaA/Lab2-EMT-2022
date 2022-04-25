package mk.ukim.finki.lab2emt.model;


import mk.ukim.finki.lab2emt.model.enumerations.Category;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Book {

    @Id
    private Long id;

    private String name;

    private Category category;

    @OneToMany(mappedBy = "book")
    private List<Author> authors;

    private Integer availableCopies;

    public Book(Long id, String name, Category category, List<Author> authors, Integer availableCopies) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.authors = authors;
        this.availableCopies = availableCopies;
    }

    public Book() {
    }
}
