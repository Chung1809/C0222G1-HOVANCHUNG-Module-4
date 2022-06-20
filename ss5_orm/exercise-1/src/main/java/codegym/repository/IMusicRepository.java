package codegym.repository;

import codegym.model.Music;

import java.util.List;

public interface IMusicRepository {
    List<Music> findAll();

    void save(Music music);

    void update(Music music);

    void delete(Integer id);

    Music findById(Integer id);

    List<Music> search(String name);
}
