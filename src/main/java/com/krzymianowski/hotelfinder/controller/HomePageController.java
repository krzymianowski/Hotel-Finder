package com.krzymianowski.hotelfinder.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class HomePageController {

    @GetMapping
    public String showHomePage() {
        return "index";
    }

    @GetMapping("/home")
    public String redirectToHomePage(){
        return "redirect:/";
    }

    @GetMapping("/logout")
    public String logoutRedirect(){
        return "redirect:/";
    }
}
