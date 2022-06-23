package com.example.demo.service;

import com.example.demo.model.Music;
import com.example.demo.repository.IMusicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MusicService implements IMusicService {
    @Autowired
    private IMusicRepository repository;
    @Override
    public List<Music> findAll() {
        return repository.findAll();
    }

    @Override
    public void save(Music music) {
        repository.save(music);
    }

    @Override
    public void update(Music music) {
        repository.updateBlog(music.getName(),music.getSingle(),music.getTypeMusic(),music.getId());
    }

    @Override
    public Music findById(Integer id) {
        return repository.findByIdBlog(id);
    }
}
