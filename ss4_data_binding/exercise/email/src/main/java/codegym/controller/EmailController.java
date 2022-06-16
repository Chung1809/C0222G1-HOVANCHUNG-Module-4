package codegym.controller;

import codegym.model.Email;
import codegym.service.IEmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class EmailController {
    @Autowired
    private IEmailService emailService;

    @GetMapping("/setting")
    public String email(Model model) {
        model.addAttribute("email", new Email());
        model.addAttribute("languageList", emailService.language());
        model.addAttribute("pageSizeList", emailService.pageSize());
        return "setting";
    }

    @GetMapping("/list")
    public String showList(Model model) {
        model.addAttribute("list", emailService.findAll());
        return "list";
    }

    @PostMapping("/setting")
    public String saveEmail(@ModelAttribute("email") Email email,
                            RedirectAttributes redirectAttributes) {

        emailService.save(email);

        redirectAttributes.addFlashAttribute("mess", "Update access");
        return "redirect:/setting";
    }
}
