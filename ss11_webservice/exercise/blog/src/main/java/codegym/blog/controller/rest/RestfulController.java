package codegym.blog.controller.rest;

import codegym.blog.model.Blog;
import codegym.blog.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@RestController
public class RestfulController {

    @Autowired
    private IBlogService service;
    @GetMapping("")
    public ResponseEntity<?> findAll(@RequestParam(name = "page", defaultValue = "0") Integer page){
        Page<Blog> blogPage = service.findAll(PageRequest.of(page,3));
        if(blogPage.isEmpty()){
            return new  ResponseEntity<>(HttpStatus.NO_CONTENT);
        }else {
            return new ResponseEntity<>(blogPage,HttpStatus.OK);
        }
    }
    @PostMapping("/add")
    public ResponseEntity<?> createBlog(@RequestBody Blog blog){
        service.save(blog);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
    @PatchMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") Integer id ,@RequestBody Blog blog){
        Optional<Blog> blog1 = service.findById(id);
        if(!blog1.isPresent()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        blog.setId(blog1.get().getId());
        service.save(blog);
        return new ResponseEntity<>(blog, HttpStatus.OK);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Integer id ){
        Optional<Blog> blog = service.findById(id);
        if(!blog.isPresent()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        service.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @GetMapping("/find/{id}")
    public ResponseEntity<?> findById(@PathVariable("id") Integer id) {
        Optional<Blog> blog1 = service.findById(id);
       if(blog1 == null){
           return new ResponseEntity<>(blog1,HttpStatus.NOT_FOUND);
       }
        return new ResponseEntity<>(blog1,HttpStatus.OK);

    }

}
