package codegym.controller;

import codegym.service.ICalculateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculateController {
    @Autowired
    private ICalculateService calculateService;

    @GetMapping("/")
    public String calculate() {
        return "home";
    }

    @PostMapping("/home")
    public String calculate(@RequestParam String operator,
                            @RequestParam Double number1,
                            @RequestParam Double number2,
                            Model model) {
        String result = calculateService.calculate(operator, number1, number2);
        model.addAttribute("result", result);
        return "home";
    }

}
