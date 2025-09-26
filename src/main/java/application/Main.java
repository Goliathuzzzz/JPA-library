package application;

import dao.LibraryDao;
import entity.*;

public class Main {
    public static void main(String[] args) {
        LibraryDao dao = new LibraryDao();

        // Create sample data
//        Student student = new Student("Teppo");
        Author authorJohn = new Author("John Doe");
//        Biography biography = new Biography("John is very talented", authorJohn);
//        Book book1 = new EBook("Book 1", authorJohn, "linktodownload");
//        Book book2 = new PrintedBook("Book 2", authorJohn, 200);

        // Persist data into database
        dao.persistAuthor(authorJohn);
//        dao.persistStudent(student);
//        dao.persistBiography(biography);
//        dao.persistBook(book1);
//        dao.persistBook(book2);

        // Borrow books and persist
//        BorrowedBook borrowedBook = new BorrowedBook(student, book1);
//        BorrowedBook borrowedBook2 = new BorrowedBook(student, book2);
//        dao.borrowBook(borrowedBook);
//        dao.borrowBook(borrowedBook2);

    }
}
