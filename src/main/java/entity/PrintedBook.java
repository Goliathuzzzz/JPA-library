package entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class PrintedBook extends Book {

    @Column(name = "page_count")
    private int pageCount;

    public PrintedBook(String name, Author author, int pageCount) {
        super(name, author);
        this.pageCount = pageCount;
    }

    public PrintedBook() {}
}
