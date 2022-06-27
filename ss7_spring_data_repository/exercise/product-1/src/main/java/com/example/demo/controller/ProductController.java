package com.example.demo.controller;

import com.example.demo.model.Product;
import com.example.demo.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
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
public class ProductController {

    @Autowired
    private IProductService service;

    @GetMapping("/list")
    public String list(@RequestParam(name = "page", defaultValue = "0") Integer page,
                       @RequestParam(name = "name" , defaultValue = "") String name, Model model) {
        Page<Product> products = service.findAll(name,PageRequest.of(page,3));
        model.addAttribute("list",products);
        model.addAttribute("product",new Product());
        model.addAttribute("name",name);
        return "list";
    }

    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("create", new Product());
        return "create";
    }

    @PostMapping("/create")
    public String createProduct(Product product) {
        service.save(product);
        return "redirect:/list";
    }

    @GetMapping("/edit/{id}")
    public String update(@PathVariable("id") Integer id, Model model) {
        model.addAttribute("product", service.findById(id));
        return "edit";
    }

    @PostMapping("/edit")
    public String updateBlog(Product product) {
        service.update(product);
        return "redirect:/list";
    }

    @GetMapping("/delete")
    public String delete(Integer id) {
        service.delete(id);
        return "redirect:/list";
    }

    @GetMapping("/findById/{id}")
    public String findById(@PathVariable("id") Integer id, Model model) {
        List<Product> productList = new ArrayList<>();
        productList.add(service.findById(id));
        model.addAttribute("findById", productList);
        return "find";
    }


}
