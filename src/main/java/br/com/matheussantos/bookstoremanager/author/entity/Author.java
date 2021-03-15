package br.com.matheussantos.bookstoremanager.author.entity;

import br.com.matheussantos.bookstoremanager.books.entity.Book;
import br.com.matheussantos.bookstoremanager.entity.Auditable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)

@Entity
public class Author extends Auditable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false, unique = true)
    private String name;

    @Column(name = "age", columnDefinition = "integer default 0")
    private int age;

    /**
     * Com essa estratégia não trazemos os dados de livros
     * à não ser que se utilize um FETCH.
     */
    @OneToMany(mappedBy = "author", fetch = FetchType.LAZY)
    private List<Book> books;
}
