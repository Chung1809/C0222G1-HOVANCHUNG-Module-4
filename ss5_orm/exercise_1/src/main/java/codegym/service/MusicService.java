package codegym.service;

import codegym.model.Music;
import codegym.repository.IMusicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MusicService implements IMusicService {
    @Autowired
    private IMusicRepository musicRepository;

    @Override
    public List<Music> findAll() {
        return musicRepository.findAll();
    }

    @Override
    public void save(Music music) {
        musicRepository.save(music);
    }

    @Override
    public void update(Music music) {
        musicRepository.update(music);
    }

    @Override
    public void delete(Integer id) {
        musicRepository.delete(id);
    }

    @Override
    public Music findById(Integer id) {
        return musicRepository.findById(id);
    }

    @Override
    public List<Music> search(String name) {
        return musicRepository.search(name);
    }
}
