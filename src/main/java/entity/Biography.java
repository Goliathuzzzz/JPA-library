package entity;

import jakarta.persistence.*;

@Entity
public class Biography {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String details;

    @OneToOne
    @JoinColumn(name = "author_id")
    private Author author;

    public Biography(String details, Author author) {
        this.details = details;
        this.author = author;
    }

    public Biography() {}

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Author getAuthor() {
        return author;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
