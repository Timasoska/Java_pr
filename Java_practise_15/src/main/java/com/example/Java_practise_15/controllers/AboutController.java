package com.example.Java_practise_15.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public class AboutController {
    @GetMapping("/about")
    public String about(Model model) {
        model.addAttribute("name","Главная страница");
        return "about";
    }
}
