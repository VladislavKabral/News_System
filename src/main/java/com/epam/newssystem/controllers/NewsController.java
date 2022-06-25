package com.epam.newssystem.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class NewsController {

    @GetMapping("/home")
    public String home() {
        return "home";
    }

    @GetMapping("/addNews")
    public String addNews() {
        return "addNews";
    }


}
