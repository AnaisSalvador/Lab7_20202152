package com.example.lab7_salvador_anais_20202152.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class HomeController {
    @GetMapping("/")
    public String index() {
        return "/gticsf";
    }
}
