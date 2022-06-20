package codegym.repository;

import codegym.model.Music;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityTransaction;
import java.util.List;

@Repository
public class MusicRepository implements IMusicRepository {
    @Override
    public List<Music> findAll() {
        List<Music> musicList = BaseRepository.entityManager.createQuery("select m from music m where status <> 1", Music.class).getResultList();
        return musicList;
    }

    @Override
    public void save(Music music) {
        music.setStatus(0);
        EntityTransaction entityTransaction = BaseRepository.entityManager.getTransaction();
        entityTransaction.begin();
        BaseRepository.entityManager.persist(music);
        entityTransaction.commit();
    }

    @Override
    public void update(Music music) {
        EntityTransaction entityTransaction = BaseRepository.entityManager.getTransaction();
        entityTransaction.begin();
        BaseRepository.entityManager.merge(music);
        entityTransaction.commit();
    }

    @Override
    public void delete(Integer id) {
        EntityTransaction entityTransaction = BaseRepository.entityManager.getTransaction();
        entityTransaction.begin();
        Music music = findById(id);
        music.setStatus(1);
        BaseRepository.entityManager.merge(music);
        entityTransaction.commit();
    }

    @Override
    public Music findById(Integer id) {
        Music music = BaseRepository.entityManager.createQuery("select m from music m where m.id = ?1", Music.class).setParameter(1, id).getSingleResult();
        return music;
    }

    @Override
    public List<Music> search(String name) {
        List<Music> musicList = BaseRepository.entityManager.createQuery("select m from music m where m.name like ?1", Music.class).setParameter(1, "%" + name + "%").getResultList();
        return musicList;
    }
}
