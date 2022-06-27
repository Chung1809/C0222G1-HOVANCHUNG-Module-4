package example.demo.controller;

import example.demo.model.Book;
import example.demo.model.User;
import example.demo.service.IUserService;
import example.demo.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class BookController {
    @Autowired
    private IBookService iBookService;
    @Autowired
    private IUserService bookService;

    @GetMapping("/list")
    public String list(@RequestParam(name = "page", defaultValue = "0") Integer page, Model model) {
        model.addAttribute("list", iBookService.findAll(PageRequest.of(page, 3)));
        return "list";
    }

    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("create", new Book());
        return "create";
    }

    @PostMapping("/create")
    public String createProduct(Book product) {
        iBookService.save(product);
        return "redirect:/list";
    }

    @GetMapping("/edit/{id}")
    public String borrowBook(@PathVariable("id") Integer id, Model model) {
        Book book = iBookService.findById(id);
        model.addAttribute("edit", book);
        if (book.getQuantity() <= 0) {
            return exceptionHandler();
        } else {
            book.setQuantity(book.getQuantity() - 1);
            User user = new User();
            Long idUser = (long) Math.floor((Math.random() * 89999) + 10000);
            user.setBook(book);
            user.setCode(idUser.toString());
            user.setName(book.getBookName());
            iBookService.save(book);
            bookService.save(user);
            return "redirect:/list";

        }

    }

    @GetMapping("/give-back")
    public String giveBackBook(@RequestParam("id") String id) {
        User user = bookService.findByCode(id);
        if (user == null) {
            return exceptionHandler();
        } else {
            Book book = user.getBook();
            book.setQuantity(book.getQuantity() + 1);
            bookService.delete(user);
            return "redirect:/list";
        }
    }

    @ExceptionHandler(Exception.class)
    public String exceptionHandler() {
        return "error";
    }


}
