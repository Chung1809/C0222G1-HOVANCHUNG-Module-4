package codegym.model;

import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;

@Entity(name = "blog")
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;
    private String content;
    @Column(name = "date_write")
    private String dateWrite;
    @Column(columnDefinition = "int default 0")
    private Integer status;

    public Blog() {
    }

    public Blog(Integer id, String title, String content, String dateWrite, Integer status) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.dateWrite = dateWrite;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDateWrite() {
        return dateWrite;
    }

    public void setDateWrite(String dateWrite) {
        this.dateWrite = dateWrite;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
