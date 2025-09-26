package entity;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(unique = true, nullable = false)
    private String name;

    @OneToMany(mappedBy = "student", cascade = CascadeType.ALL)
    private final Set<BorrowedBook> borrowedBooks = new HashSet<>();

    public Student(String name) {
        this.name = name;
    }

    public Student() {}

    public String getName() {
        return name;
    }

    public void addBorrowedBook(BorrowedBook book) {
        borrowedBooks.add(book);
    }

    public Set<BorrowedBook> getBooks() {
        return borrowedBooks;
    }
}
