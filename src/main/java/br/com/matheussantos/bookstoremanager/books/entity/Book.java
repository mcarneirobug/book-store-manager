package br.com.matheussantos.bookstoremanager.books.entity;

import br.com.matheussantos.bookstoremanager.author.entity.Author;
import br.com.matheussantos.bookstoremanager.publishers.entity.Publisher;
import br.com.matheussantos.bookstoremanager.users.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "book")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false, length = 100)
    private String name;

    @Column(name = "isbn", nullable = false)
    private String isbn;

    @Column(name = "pages", columnDefinition = "integer default 0")
    private int pages;

    @Column(name = "chapters", columnDefinition = "integer default 0")
    private int chapters;

    @ManyToOne(cascade = { CascadeType.MERGE })
    private Author author;

    @ManyToOne(cascade = { CascadeType.MERGE })
    private Publisher publisher;

    @ManyToOne(cascade = { CascadeType.MERGE })
    private User user;
}
