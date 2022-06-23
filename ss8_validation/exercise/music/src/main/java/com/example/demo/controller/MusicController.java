package com.example.demo.controller;

import com.example.demo.model.Music;
import com.example.demo.service.IMusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class MusicController {
    @Autowired
    private IMusicService service;
    @GetMapping("/list")
    public String list(Model model){
        model.addAttribute("list",service.findAll());
        return "list";
    }

    @GetMapping("/create")
    public String create(Model model){
        model.addAttribute("create",new Music());
        return "create";
    }

    @PostMapping("/create")
    public String creatUser(@Valid @ModelAttribute("create") Music music , BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return "create";
        }
        service.save(music);
        return "redirect:/list";
    }
    @GetMapping("/edit/{id}")
    public String update(@PathVariable("id") Integer id, Model model) {
        model.addAttribute("music", service.findById(id));
        return "edit";
    }

    @PostMapping("/edit")
    public String updateBlog(@Valid @ModelAttribute("music") Music music,BindingResult bindingResult) {
        if(bindingResult.hasErrors()){
            return "edit";
        }
        service.update(music);
        return "redirect:/list";
    }
}
