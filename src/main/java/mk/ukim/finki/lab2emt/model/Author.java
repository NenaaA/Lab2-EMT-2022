package mk.ukim.finki.lab2emt.model;

import javax.persistence.*;

@Entity
public class Author {

    @Id
    private Long id;

    private String name;

    private String surname;

    @ManyToOne
    private Country country;

    @ManyToOne
    private Book book;

    public Author(Long id, String name, String surname, Country country) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.country = country;
    }

    public Author() {
    }
}
