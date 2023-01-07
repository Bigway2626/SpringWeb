package com.marketweb.webdamo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.marketweb.webdamo.model.gitData;
import com.marketweb.webdamo.DBconnect.postgresqlConnect;

import java.sql.Connection;


/**
 * @author bigway2626.huang
 */
@Controller
public class MainController {
    postgresqlConnect PGdb = new  postgresqlConnect();
    String selectSql = "SELECT * FROM git_command ";
    String Getdata = PGdb.SelectOneFieldValue(selectSql,"command");
    String name =gitData.ReturnGitFounction("1");

    public MainController() throws Exception {
        System.out.println(Getdata);
    }

    @GetMapping("/elements")// ViewResolver
    public String GetElements( Model model) {
        model.addAttribute("title", "This is Title");
        model.addAttribute("name", Getdata);
        return "elements";
    }

    @GetMapping("/generic")// ViewResolver
    public String Getgeneric() {
        return "generic";
    }
}
