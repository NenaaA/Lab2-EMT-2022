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

    public Book(String name, Category category, List<Author> authors, Integer availableCopies) {
        this.name = name;
        this.category = category;
        this.authors = authors;
        this.availableCopies = availableCopies;
    }

    public Book() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    public void setAvailableCopies(Integer availableCopies) {
        this.availableCopies = availableCopies;
    }
}
