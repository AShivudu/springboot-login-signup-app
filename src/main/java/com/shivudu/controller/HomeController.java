package com.shivudu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @GetMapping("/hello")
    @ResponseBody
    public String hello() {
        return "Welcome to Shivudu...!";
    }

    @GetMapping("/home")
    public String home() {
        return "home";
    }
   
}