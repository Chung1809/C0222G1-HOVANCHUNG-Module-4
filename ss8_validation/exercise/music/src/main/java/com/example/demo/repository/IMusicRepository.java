package com.example.demo.repository;

import com.example.demo.model.Music;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;

@Transactional
public interface IMusicRepository extends JpaRepository<Music,Integer> {
    @Modifying
    @Query(value = "update music set name = :name,single = :single, type_music = :typeMusic where id = :id", nativeQuery = true)
    void updateBlog(@Param("name") String name,
                    @Param("single") String single,
                    @Param("typeMusic") String type,
                    @Param("id") Integer id);


    @Query(value = "select * from music where id = :id", nativeQuery = true)
    Music findByIdBlog(@Param("id") Integer id);
}
