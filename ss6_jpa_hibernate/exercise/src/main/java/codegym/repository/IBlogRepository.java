package codegym.repository;

import codegym.model.Blog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;


@Transactional
public interface IBlogRepository extends JpaRepository<Blog, Integer> {

    @Query(value = "select * from blog where status = 0", nativeQuery = true)
    List<Blog> findAllBlog();

    @Modifying
    @Query(value = "insert into blog(title,content,date_write) values(:title,:content,:date)", nativeQuery = true)
    void save(@Param("title") String title,
              @Param("content") String content,
              @Param("date") String date);

    @Modifying
    @Query(value = "update blog set title = :title,content = :content, date_write = :dateWrite where id = :id", nativeQuery = true)
    void updateBlog(@Param("title") String title,
                    @Param("content") String content,
                    @Param("dateWrite") String date,
                    @Param("id") Integer id);


    @Query(value = "select * from blog where id = :id", nativeQuery = true)
    Blog findByIdBlog(@Param("id") Integer id);

    @Modifying
    @Query(value = " update blog set status = 1 where id = :id", nativeQuery = true)
    void deleteBlog(@Param("id") Integer id);
}
