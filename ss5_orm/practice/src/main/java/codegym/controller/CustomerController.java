package codegym.controller;

import codegym.model.Customer;
import codegym.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CustomerController {
    @Autowired
    private ICustomerService service;

    @GetMapping("/list")
    public String list(Model model){
        model.addAttribute("list",service.findAll());
        return "list";
    }
    @GetMapping("/create")
    public String create(Model model){
        model.addAttribute("create",new Customer());
        return "create";
    }
    @PostMapping("/create")
    public String createCustomer(Customer customer){
        service.save(customer);
        return "redirect:/list";
    }
}
