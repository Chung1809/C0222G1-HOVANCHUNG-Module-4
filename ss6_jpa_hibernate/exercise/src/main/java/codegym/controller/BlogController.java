package codegym.controller;

import codegym.model.Blog;
import codegym.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class BlogController {

    @Autowired
    private IBlogService service;

    @GetMapping("/list")
    public String createBlog(Model model) {
        model.addAttribute("list", service.findAll());
        return "list";
    }

    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("create", new Blog());
        return "create";
    }

    @PostMapping("/create")
    public String createBlog(Blog blog) {
        service.save(blog);
        return "redirect:/list";
    }

    @GetMapping("/edit/{id}")
    public String update(@PathVariable("id") Integer id, Model model) {
        model.addAttribute("blog", service.findById(id));
        return "edit";
    }

    @PostMapping("/edit")
    public String updateBlog(Blog blog) {
        service.update(blog);
        return "redirect:/list";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") Integer id) {
        service.delete(id);
        return "redirect:/list";
    }

    @GetMapping("/findById/{id}")
    public String findById(@PathVariable("id") Integer id, Model model) {
        List<Blog> blogList = new ArrayList<>();
        blogList.add(service.findById(id));
        model.addAttribute("list", blogList);
        return "list";
    }
}
