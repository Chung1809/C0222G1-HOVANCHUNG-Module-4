package codegym.model;

import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;

@Entity(name = "music")
public class Music {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "name", columnDefinition = "varchar(200)")
    private String name;
    private String artist;
    @Column(name = "type_music")
    private String typeMusic;
    @Column(name = "link_file_music")
    private String linkFileMusic;
    private Integer status = 0;

    public Music() {
    }

    public Music(Integer id, String name, String artist, String typeMusic, String linkFileMusic, Integer status) {
        this.id = id;
        this.name = name;
        this.artist = artist;
        this.typeMusic = typeMusic;
        this.linkFileMusic = linkFileMusic;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getTypeMusic() {
        return typeMusic;
    }

    public void setTypeMusic(String typeMusic) {
        this.typeMusic = typeMusic;
    }

    public String getLinkFileMusic() {
        return linkFileMusic;
    }

    public void setLinkFileMusic(String linkFileMusic) {
        this.linkFileMusic = linkFileMusic;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
