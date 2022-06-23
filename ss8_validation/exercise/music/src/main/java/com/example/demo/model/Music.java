package com.example.demo.model;

import com.example.demo.ultis.NameConstraint;
import com.example.demo.ultis.SingleConstraint;
import com.example.demo.ultis.TypeMusicConstraint;

import javax.persistence.*;

@Entity(name = "music")
public class Music {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id;
    @NameConstraint
    private String name;
    @SingleConstraint
    private String single;
    @TypeMusicConstraint
    @Column(name = "type_music")
    private String typeMusic;

    public Music() {
    }

    public Music(Integer id, String name, String single, String typeMusic) {
        this.id = id;
        this.name = name;
        this.single = single;
        this.typeMusic = typeMusic;
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

    public String getSingle() {
        return single;
    }

    public void setSingle(String single) {
        this.single = single;
    }

    public String getTypeMusic() {
        return typeMusic;
    }

    public void setTypeMusic(String typeMusic) {
        this.typeMusic = typeMusic;
    }
}
