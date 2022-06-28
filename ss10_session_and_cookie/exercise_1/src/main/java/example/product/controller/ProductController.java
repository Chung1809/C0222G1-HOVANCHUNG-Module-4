package example.product.controller;

import example.product.model.Cart;
import example.product.model.Product;
import example.product.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@SessionAttributes("cart")
public class ProductController {
    @Autowired
    private IProductService service;

    @ModelAttribute("cart")
    public Cart setUpCart(){
        return new Cart();
    }

    @GetMapping("/list")
    public String list(Model model){
        model.addAttribute("productList",service.findAll());
        return "list";
    }


    @GetMapping("/add/{id}")
    public String addToCart(@PathVariable("id") Integer id , @SessionAttribute Cart cart ,
                            @RequestParam("action") String action){
         Optional<Product> product = service.findById(id);
         if(!product.isPresent()){
             return "error";
         }
         if(action.equals("show")){
           cart.addProduct(product.get());
           return "redirect:/shopping-cart";
         }
         cart.addProduct(product.get());
         return "cart";
    }
    @GetMapping("/delete/{id}")
    public String deleteFromCart(@PathVariable Integer id, @SessionAttribute Cart cart) {
        Optional<Product> product = service.findById(id);
        if (product == null) {
            return "error";
        } else {
            cart.deleteProduct(product.get());
            return "cart";
        }
    }
}
