package org.admin.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class homecontroller {

    @GetMapping
    public String index(){
        return "home/index";
    }

    @GetMapping("/privacy")
    public String privacy(){
        return "home/privacy";
    }

    @GetMapping("/terms")
    public String terms(){
        return "home/terms";
    }
}