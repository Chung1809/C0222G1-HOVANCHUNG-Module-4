package example.demo.model;

import javax.persistence.*;


@Entity(name = "user")
public class User {
    @Id
    private String code;
    private String name;
    @ManyToOne
    @JoinColumn(name = "book_id", nullable = false)
    private Book book;

    public User(Book book) {
        this.book = book;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public User() {
    }

    public User(String code, String name, Book book) {
        this.code = code;
        this.name = name;
        this.book = book;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
