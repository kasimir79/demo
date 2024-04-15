package com.kasimir.demo.controller;

import com.kasimir.demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Autowired
    DemoService service;

    @GetMapping(path="/user/{id}")
    public String getUser(@PathVariable Long id){
        return service.getUser(id);
    }
}
