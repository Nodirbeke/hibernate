package uz.jl.hibernate.models;

import lombok.Getter;
import lombok.Setter;
import uz.jl.hibernate.enums.BookType;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 50, nullable = false, updatable = false, insertable = true)
    private String name;

    private String author;

    @Enumerated(EnumType.STRING)
    private BookType bookType;

}
