package com.marketweb.webdamo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {
    @RequestMapping("/test")
    @ResponseBody
    public String hello() {
        return "Hey, Spring Boot 的 Hello World !";
    }
}
