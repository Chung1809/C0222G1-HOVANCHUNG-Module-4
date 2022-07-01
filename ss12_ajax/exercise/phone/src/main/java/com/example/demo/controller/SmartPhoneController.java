package com.example.demo.controller;

import com.example.demo.service.ISmartPhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SmartPhoneController {
    @Autowired
    private ISmartPhoneService smartPhoneService;

    @GetMapping("/list")
    public String showList(Model model) {
        model.addAttribute("smartphones", smartPhoneService.findAll());
        return "list";
    }
}
