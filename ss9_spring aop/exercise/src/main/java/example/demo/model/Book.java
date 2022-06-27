package example.demo.model;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer bookId;
    private String bookName;
    private Integer quantity;
    @OneToMany(mappedBy = "book")
    private Set<User> bookSet;

    public Book(Set<User> bookSet) {
        this.bookSet = bookSet;
    }

    public Set<User> getBookSet() {
        return bookSet;
    }

    public void setBookSet(Set<User> bookSet) {
        this.bookSet = bookSet;
    }

    public Book() {
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
