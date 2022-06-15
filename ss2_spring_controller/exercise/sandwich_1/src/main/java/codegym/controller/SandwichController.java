package codegym.controller;

import codegym.service.ISandwichService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SandwichController {
    @Autowired
    private ISandwichService sandwichService;

    @GetMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("/result")
    public String condiment( String[] condiment, Model model) {
        model.addAttribute("condiment", sandwichService.sandwich(condiment));
        return "result";
    }
}
