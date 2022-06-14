package codegym.controller;

import codegym.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import codegym.service.ICustomerService;

import java.util.List;

public class CustomerController {
    @Autowired
    private ICustomerService customerService;

    @GetMapping("/customer")
    public String showList(Model model){
        List<Customer> customers = customerService.findAll();
        model.addAttribute("customers",customers);
        return "list";
    }
}
