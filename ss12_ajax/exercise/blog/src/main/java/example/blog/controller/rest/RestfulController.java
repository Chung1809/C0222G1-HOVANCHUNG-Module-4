package example.blog.controller.rest;

import example.blog.model.Blog;
import example.blog.model.Category;
import example.blog.service.IBlogService;
import example.blog.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@RequestMapping("blog")
@RestController
public class RestfulController {

    @Autowired
    private IBlogService service;
    @Autowired
    private ICategoryService categoryService;
    @GetMapping
    public ResponseEntity<?> findAll(){
        List<Blog> blogs = service.findAll();
        return new ResponseEntity<>(blogs,HttpStatus.OK);
    }
    @PostMapping("/add")
    public ResponseEntity<?> createBlog(@RequestBody Blog blog){
        List<Category> categories = categoryService.findAll();
        service.save(blog);
        return new ResponseEntity<>(categories,HttpStatus.CREATED);
    }
    @PutMapping("/update")
    public ResponseEntity<?> update(@RequestBody Blog blog){
        service.update(blog);
        return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
    }

    @DeleteMapping("/remove/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Integer id ){
        Optional<Blog> phone = service.findById(id);
        if(!phone.isPresent()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        service.findById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @GetMapping("/find/{id}")
    public ResponseEntity<?> findById(@PathVariable("id") Integer id) {
        Optional<Blog> blog = service.findById(id);
        if(blog == null){
            return new ResponseEntity<>(blog, HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(blog, HttpStatus.OK);

    }
    @GetMapping("/search/{title}")
    public ResponseEntity<?> searchBlog(@PathVariable("title")  String title){
        List<Blog> blogList = service.search(title);
        return new ResponseEntity<>(blogList,HttpStatus.OK);
    }
    @GetMapping("/load/{size}")
    public  ResponseEntity<?>  loadBlog(@PathVariable("size") Integer size){
        List<Blog> blogList = service.findAll();
        if(blogList.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }else {
            List<Blog> blogs = new ArrayList<>();
            for (int i = 0; i <size+1 ; i++) {
                blogs.add(blogList.get(i));
            }
            return new ResponseEntity<>(blogs,HttpStatus.OK);
        }

    }

}
