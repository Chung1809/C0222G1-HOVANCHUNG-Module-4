package com.codegym.controller;

import com.codegym.service.IDictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DictionaryController {
    @Autowired
    private IDictionaryService dictionaryService;

    @GetMapping("/home")
    public String home() {
        return "home";
    }

    @PostMapping("/home")
    public String dictionary(@RequestParam String word, Model model) {
        model.addAttribute("dictionary", dictionaryService.translate(word));
        model.addAttribute("word", word);
        return "home";
    }

}
