package entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class EBook extends Book{

    @Column(name = "download_link")
    private String downloadLink;

    public EBook(String name, Author author, String downloadLink) {
        super(name, author);
        this.downloadLink = downloadLink;
    }

    public EBook() {

    }

}
