package codegym.blog.controller;

import codegym.blog.model.Blog;
import codegym.blog.service.IBlogService;
import codegym.blog.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class BlogController {

    @Autowired
    private IBlogService service;
    @Autowired
    private ICategoryService categoryService;

    @GetMapping("/list")
    public String createBlog(@RequestParam(name = "page", defaultValue = "0") Integer page, Model model) {
        Sort sort = Sort.by("date_write").descending();
        model.addAttribute("list", service.findAll(PageRequest.of(page, 3, sort)));
        return "list";
    }

    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("create", new Blog());
        model.addAttribute("listCategory", categoryService.findAll());
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
        blogList.add(service.findById(id).get());
        model.addAttribute("findById", blogList);
        return "find";
    }

    @GetMapping("/search")
    public String searchBlog(@RequestParam(name = "page", defaultValue = "0") Integer page, Blog blog, Model model) {
        model.addAttribute("list", service.search("%" + blog.getTitle() + "%", PageRequest.of(page, 3)));
        return "list";
    }
}
