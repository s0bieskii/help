package com.protector.carprotector.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    /*@GetMapping("/hejka")
    public String homeControl() {
        return "/home";
    }*/
    @Value("${spring.application.name}")
    String apppName;

    @GetMapping("/")
    public String homePage(Model model) {
        model.addAttribute("appName", apppName);
        return "home";
    }
}
/*@Controller
public class HomeController {
    @Value("${spring.application.name}")
    String appName;

    @GetMapping("/")
    public String homePage(Model model) {
        model.addAttribute("appName", appName);
        return "home";
    }
}*/