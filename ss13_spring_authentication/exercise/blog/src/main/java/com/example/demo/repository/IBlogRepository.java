package com.example.demo.repository;

import com.example.demo.model.Blog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public interface IBlogRepository extends JpaRepository<Blog, Integer> {


    @Modifying
    @Query(value = " update blog set status = 1 where id = :id", nativeQuery = true)
    void deleteBlog(@Param("id") Integer id);

    List<Blog> findByTitleContaining(String title);
}
