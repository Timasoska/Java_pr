package com.example.Java_practise_15.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public class AdvantagesController {
    @GetMapping("/advantages")
    public String advantages(Model model) {
        model.addAttribute("name","Главная страница");
        return "advantages";
    }
}
