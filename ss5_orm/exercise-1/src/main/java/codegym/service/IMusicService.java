package codegym.service;

import codegym.model.Music;

import java.util.List;

public interface IMusicService {
    List<Music> findAll();

    void save(Music music);

    void update(Music music);

    void delete(Integer id);

    Music findById(Integer id);

    List<Music> search(String name);
}
