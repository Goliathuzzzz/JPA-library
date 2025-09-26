package dao;

import entity.*;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class LibraryDao {
    private final EntityManagerFactory emf;

    public LibraryDao() {
         emf = Persistence.createEntityManagerFactory("lib");
    }

    public void persistStudent(Student student) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(student);
        em.getTransaction().commit();
        System.out.println("Student persisted:" + student.getName());
    }

    public void persistBook(Book book) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(book);
        em.getTransaction().commit();
        System.out.println("Book persisted:" + book.getTitle());
    }

    public void persistAuthor(Author author) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(author);
        em.getTransaction().commit();
        System.out.println("Author persisted: " + author.getName());
    }

    public void persistBiography(Biography biography) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(biography);
        em.getTransaction().commit();
        System.out.println("Biography persisted");
    }

    public void borrowBook(BorrowedBook borrowedBook) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(borrowedBook);
        em.getTransaction().commit();
        System.out.println("Book borrowed successfully");
    }
}
