package codegym.controller;

import codegym.model.MedicalDeclaration;
import codegym.service.IMedicalDeclarationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


@Controller
public class MedicalDeclarationController {

    @Autowired
    private IMedicalDeclarationService medicalDeclarationService;

    @GetMapping("/create")
    public String medical(Model model) {
        model.addAttribute("medical", new MedicalDeclaration());
        model.addAttribute("birthday", medicalDeclarationService.birthDay());
        model.addAttribute("gender", medicalDeclarationService.gender());
        model.addAttribute("nationality", medicalDeclarationService.nationality());
        model.addAttribute("informationTravel", medicalDeclarationService.informationTravel());
        model.addAttribute("departureDay", medicalDeclarationService.departureDay());
        model.addAttribute("departureMonth", medicalDeclarationService.departureMonth());
        model.addAttribute("departureYear", medicalDeclarationService.departureYear());
        model.addAttribute("endDay", medicalDeclarationService.endDay());
        model.addAttribute("endMonth", medicalDeclarationService.endMonth());
        model.addAttribute("endYear", medicalDeclarationService.endYear());
        return "medical";
    }

    @GetMapping("/list")
    public String medicalList(Model model) {
        model.addAttribute("declaration", medicalDeclarationService.findAll());
        return "list";
    }

    @PostMapping("/create")
    public String medicalDeclaration(@ModelAttribute("medical") MedicalDeclaration medicalDeclaration,
                                     RedirectAttributes redirectAttributes) {

        medicalDeclarationService.save(medicalDeclaration);

        redirectAttributes.addFlashAttribute("mess", "Update access");
        return "redirect:/create";
    }
}
