package com.example.demo.controller;


import com.example.demo.model.Blog;
import com.example.demo.service.IBlogService;
import com.example.demo.service.ICategoryService;
import com.example.demo.ultis.WebUtils;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.security.Principal;
import java.util.ArrayList;
import java.util.List;


@Controller
public class BlogController {

    @Autowired
    private IBlogService service;
    @Autowired
    private ICategoryService categoryService;

    @RequestMapping("/list")
    public String listBlog( Model model) {
        List<Blog> blogList = service.findAll();
//        List<Blog> blogs = new ArrayList<>();
//        blogs.add(blogList.get(0));
        model.addAttribute("list", blogList);
        model.addAttribute("listCategory", categoryService.findAll());
        return "list";
    }
    @RequestMapping(value = "/userInfo", method = RequestMethod.GET)
    public String userInfo(Model model, Principal principal) {

        // Sau khi user login thanh cong se co principal
        String userName = principal.getName();

        System.out.println("User Name: " + userName);

        User loginedUser = (User) ((Authentication) principal).getPrincipal();

        String userInfo = WebUtils.toString((org.springframework.security.core.userdetails.User) loginedUser);
        model.addAttribute("userInfo", userInfo);

        return "userInfoPage";
    }
    @RequestMapping(value = "/logoutSuccessful", method = RequestMethod.GET)
    public String logoutSuccessfulPage(Model model) {
        model.addAttribute("title", "Logout");
        return "logoutSuccessfulPage";
    }
}

