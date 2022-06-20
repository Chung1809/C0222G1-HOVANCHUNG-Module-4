package codegym.controller;

import codegym.model.Product;
import codegym.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProductController {
    @Autowired
    private IProductService service;

    @GetMapping("/list")
    public String listProduct(Model model) {
        model.addAttribute("listProduct", service.findAll());
        return "list";
    }

    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("create", new Product());
        return "create";
    }

    @PostMapping("/create")
    public String createProduct(Product product) {
        service.save(product);
        return "redirect:/list";
    }

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Integer id, Model model) {
        model.addAttribute("product", service.findById(id));
        return "edit";
    }

    @PostMapping("/edit")
    public String editProduct(Product product) {
        service.update(product);
        return "redirect:/list";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") Integer id) {
        service.delete(id);
        return "redirect:/list";
    }

    @GetMapping("/search")
    public String search(Product product, Model model) {
        model.addAttribute("listProduct", service.search(product.getName()));
        return "list";
    }
}
