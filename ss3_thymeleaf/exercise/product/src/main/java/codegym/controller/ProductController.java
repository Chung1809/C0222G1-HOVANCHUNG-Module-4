package codegym.controller;

import codegym.model.Product;
import codegym.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ProductController {
    @Autowired
    private IProductService productService;

    @GetMapping("/list")
    public String list(Model model) {
        model.addAttribute("list", productService.findAll());
        model.addAttribute("product", new Product());
        return "list";
    }

    @GetMapping("/create")
    public String createGet(Model model) {
        model.addAttribute("create", new Product());
        return "create";
    }

    @PostMapping("/create")
    public String create(Product product, RedirectAttributes redirectAttributes) {
        product.setId((int) (Math.random() * 100));
        productService.save(product);
        redirectAttributes.addFlashAttribute("mess", "Thêm thành công");
        return "redirect:/list";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") int id) {
        productService.delete(id);
        return "redirect:/list";
    }

    @GetMapping("/edit/{id}")
    public String editGet(@PathVariable("id") int id, Model model) {
        model.addAttribute("product", productService.findById(id));
        return "edit";
    }

    @PostMapping("/edit")
    public String edit(Product product) {
        productService.update(product);
        return "redirect:/list";
    }

    @GetMapping("/findById/{id}")
    public String findById(@PathVariable("id") int id, Model model) {
        List<Product> productList = new ArrayList<>();
        productList.add(productService.findById(id));
        model.addAttribute("list", productList);
        return "list";
    }

    @GetMapping("/search")
    public String search(Product product, Model model) {
        List<Product> productList = productService.search(product.getName());
        model.addAttribute("list", productList);
        return "list";
    }
}
