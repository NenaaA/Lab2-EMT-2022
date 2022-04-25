package mk.ukim.finki.lab2emt.model.dto;

import lombok.Data;

import java.util.List;

@Data
public class BookDto {

    private String name;

    private Long category;

    private List<Long> authors;

    private Integer availableCopies;

    public BookDto(String name, Long category, List<Long> authors, Integer availableCopies) {
        this.name = name;
        this.category = category;
        this.authors = authors;
        this.availableCopies = availableCopies;
    }

    public BookDto() {
    }
}
