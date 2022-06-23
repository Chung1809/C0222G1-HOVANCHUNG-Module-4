package com.example.demo.controller;

import com.example.demo.model.Product;
import com.example.demo.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class ProductController {

    @Autowired
    private IProductService service;
    @GetMapping("/list")
    public String list(Model model){
        model.addAttribute("list",service.findAll());
        return "list";
    }

    @GetMapping("/create")
    public String create(Model model){
        model.addAttribute("create",new Product());
        return "create";
    }

    @PostMapping("/create")
    public String creatUser(@Valid @ModelAttribute("create") Product product , BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return "create";
        }
        service.save(product);
        return "redirect:/list";
    }
}
