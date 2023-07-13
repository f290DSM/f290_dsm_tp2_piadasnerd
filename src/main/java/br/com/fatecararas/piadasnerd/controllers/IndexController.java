package br.com.fatecararas.piadasnerd.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class IndexController {

    @GetMapping
    public String index() {
        System.out.println("Passou pelo IndexController...");
        return "index";
    }
    
}
