package entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class BorrowedBook {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "borrow_date")
    private Date borrowDate;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

    @ManyToOne
    @JoinColumn(name = "book_id")
    private Book book;

    public BorrowedBook(Student student, Book book) {
        this.student = student;
        this.book = book;
        this.borrowDate = new Date();
        student.addBorrowedBook(this);
        book.addBorrowedBook(this);
    }

    public BorrowedBook() {}

    public Book getBook() {
        return book;
    }

    public Date getBorrowDate() {
        return borrowDate;
    }

    public int getId() {
        return id;
    }

    public Student getStudent() {
        return student;
    }
}
