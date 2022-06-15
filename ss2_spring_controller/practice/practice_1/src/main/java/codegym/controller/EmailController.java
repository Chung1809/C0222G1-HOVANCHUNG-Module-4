package codegym.controller;

import codegym.service.IEmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EmailController {
    @Autowired
    private IEmailService emailService;
    @GetMapping("/home")
    public String home(){
        return "home";
    }
    @PostMapping("/home")
    public String email(@RequestParam("validate") String validate, Model model){
            if (emailService.email(validate)) {
                model.addAttribute("validate",validate);
                return "success";
            }else {
                model.addAttribute("mess","Email is invalid");
                return "home";
            }

    }
}
