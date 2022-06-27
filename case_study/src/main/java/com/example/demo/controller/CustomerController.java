package com.example.demo.controller;

import com.example.demo.model.customer.Customer;
import com.example.demo.service.customer.ICustomerService;
import com.example.demo.service.customer.ICustomerTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class CustomerController {
    @Autowired
    private ICustomerService service;
    @Autowired
    private ICustomerTypeService typeService;
    @GetMapping("/")
    public String home(){
        return "about";
    }

    @GetMapping("/list")
    public String list(@RequestParam(name = "page", defaultValue = "0") Integer page,
                       @RequestParam(name = "name" , defaultValue = "") String name, Model model) {
        Page<Customer> customers = service.findAll(name, PageRequest.of(page,3));
        model.addAttribute("list",customers);
        model.addAttribute("name",name);
        return "customer/list";
    }

    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("create", new Customer());
        model.addAttribute("listCustomerType",typeService.findAll());
        return "customer/create";
    }

    @PostMapping("/create")
    public String createCustomer(Customer customer) {
        service.save(customer);
        return "redirect:customer/list";
    }

    @GetMapping("/edit/{id}")
    public String update(@PathVariable("id") Integer id, Model model) {
        model.addAttribute("customer", service.findById(id));
        return "customer/edit";
    }

    @PostMapping("/edit")
    public String updateCustomer(Customer customer) {
        service.update(customer);
        return "redirect:customer/list";
    }

    @GetMapping("/delete")
    public String delete(Integer id) {
        service.delete(id);
        return "redirect:customer/list";
    }


}
