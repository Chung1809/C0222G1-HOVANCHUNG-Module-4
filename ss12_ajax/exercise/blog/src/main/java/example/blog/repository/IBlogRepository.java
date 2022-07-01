package example.blog.repository;

import example.blog.model.Blog;
import example.blog.model.Category;
import example.blog.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;

@Transactional
public interface IBlogRepository extends JpaRepository<Blog, Integer> {

    @Query(value = "select * from blog where status = 0", nativeQuery = true)
    Page<Blog> findAllBlog(Pageable pageable);


    @Modifying
    @Query(value = "update blog set title = :title,content = :content, date_write = :dateWrite where id = :id", nativeQuery = true)
    void updateBlog(@Param("title") String title,
                    @Param("content") String content,
                    @Param("dateWrite") String date,
                    @Param("id") Integer id);

    @Modifying
    @Query(value = " update blog set status = 1 where id = :id", nativeQuery = true)
    void deleteBlog(@Param("id") Integer id);

    @Query(value = "select *from blog where title like :title and status = 0", nativeQuery = true)
    Page<Blog> searchBlog(@Param("title") String title, Pageable pageable);
}
