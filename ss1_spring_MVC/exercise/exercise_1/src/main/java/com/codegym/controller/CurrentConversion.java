package com.codegym.controller;

import com.codegym.service.ICurrentConversionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CurrentConversion {
   @Autowired
   private ICurrentConversionService currentConversion;

   @GetMapping("/home")
    public String home(){
       return "home";
   }

   @PostMapping( "/home")
    public String convert(@RequestParam String usd , Model model){
      if(usd != null & !usd.equals(usd)){
         model.addAttribute("usd",currentConversion.convert(Double.parseDouble(usd)));
         model.addAttribute("oldUsd",usd);
      }else {
         model.addAttribute("mess","Please enter the number");
      }
      return "home";
   }
}
