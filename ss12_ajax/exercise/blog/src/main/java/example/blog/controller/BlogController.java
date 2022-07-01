package example.blog.controller;


import example.blog.model.Blog;
import example.blog.service.IBlogService;
import example.blog.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;


@Controller
public class BlogController {

    @Autowired
    private IBlogService service;
    @Autowired
    private ICategoryService categoryService;

    @GetMapping("/list")
    public String listBlog( Model model) {
        List<Blog> blogList = service.findAll();
        List<Blog> blogs = new ArrayList<>();
        blogs.add(blogList.get(0));
        model.addAttribute("list", blogs);
        model.addAttribute("listCategory", categoryService.findAll());
        return "list";
    }
}

