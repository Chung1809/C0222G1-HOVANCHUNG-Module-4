package com.example.demo.service;

import com.example.demo.model.Music;

import java.util.List;

public interface IMusicService {
    List<Music> findAll();
    void save(Music music);

    void update(Music music);

    Music findById(Integer id);
}
