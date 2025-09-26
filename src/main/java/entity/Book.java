package entity;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "title", unique = true, nullable = false)
    private String title;

    @ManyToOne(fetch = FetchType.EAGER)
    private Author author;

    @OneToMany(mappedBy = "book", cascade = CascadeType.ALL)
    private final Set<BorrowedBook> borrowedBooks = new HashSet<>();

    protected Book(String title, Author author) {
        this.title = title;
        this.author = author;
    }

    protected Book() {

    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void addBorrowedBook(BorrowedBook book) {
        borrowedBooks.add(book);
    }

    public Set<BorrowedBook> getBorrowedBooks() {
        return borrowedBooks;
    }
}
