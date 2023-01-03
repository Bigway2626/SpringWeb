package com.marketweb.webdamo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class MainController {
    @GetMapping("/elements")// ViewResolver
    public String GetElements() {
        return "elements";
    }

    @GetMapping("/generic")// ViewResolver
    public String Getgeneric() {
        return "generic";
    }
}
