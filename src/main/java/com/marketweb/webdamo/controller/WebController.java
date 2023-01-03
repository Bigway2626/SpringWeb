package com.marketweb.webdamo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WebController { //!!請自行修正：GreetingController是這支程式的檔名
    @RequestMapping("/index1") //對應的網址
    public String greeting(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        //讓HTML中的Thymeleaf語法{name}取得屬性值
        return "index1";
        //!!請自行修正：剛才建立的HTML檔案名稱
    }
}
