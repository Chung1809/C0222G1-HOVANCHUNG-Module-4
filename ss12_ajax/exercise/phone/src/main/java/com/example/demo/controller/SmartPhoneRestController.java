package com.example.demo.controller;

import com.example.demo.model.SmartPhone;
import com.example.demo.service.ISmartPhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping("phone")
public class SmartPhoneRestController {
    @Autowired
    private ISmartPhoneService service;

    @GetMapping
    public ResponseEntity<Iterable<SmartPhone>> findAll(){
        Iterable<SmartPhone> phonePage = service.findAll();
        return new ResponseEntity<>(phonePage, HttpStatus.OK);
    }
    @PostMapping("/add")
    public ResponseEntity<?> createBlog(@RequestBody SmartPhone phone){
        service.save(phone);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
    @PatchMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") Integer id , @RequestBody SmartPhone phone){
        Optional<SmartPhone> phone1 = service.findById(id);
        if(!phone1.isPresent()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        phone.setId(phone1.get().getId());
        service.update(phone);
        return new ResponseEntity<>(phone, HttpStatus.OK);
    }
    @DeleteMapping("/remove/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Integer id ){
        Optional<SmartPhone> phone = service.findById(id);
        if(!phone.isPresent()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        service.remove(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @GetMapping("/find/{id}")
    public ResponseEntity<?> findById(@PathVariable("id") Integer id) {
        Optional<SmartPhone> phone = service.findById(id);
        if(phone == null){
            return new ResponseEntity<>(phone, HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(phone, HttpStatus.OK);

    }
}