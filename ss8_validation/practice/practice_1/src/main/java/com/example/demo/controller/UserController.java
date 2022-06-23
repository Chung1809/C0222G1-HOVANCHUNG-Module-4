package com.example.demo.controller;

import com.example.demo.model.UserStudent;
import com.example.demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class UserController {

    @Autowired
    private IUserService service;

    @GetMapping("/list")
    public String list(Model model){
        model.addAttribute("list",service.findAll());
        return "list";
    }
    @GetMapping("/create")
    public String create( Model model){
        model.addAttribute("userTemp",new UserStudent());
        return "create";
    }
    @PostMapping("/create")
    public String createUser(@Valid @ModelAttribute("userTemp")UserStudent userTemp, BindingResult bindingResult ){
        if(bindingResult.hasErrors()){
            return "create";
        }
        service.save(userTemp);
        return "redirect:/list";
    }
}
