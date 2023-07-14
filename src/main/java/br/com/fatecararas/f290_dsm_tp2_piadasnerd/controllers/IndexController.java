package br.com.fatecararas.f290_dsm_tp2_piadasnerd.controllers;

import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class IndexController {

    @GetMapping
    public String index(Model model) {
        model.addAttribute("titulo", "Título dinamico via Thymeleaf.");
        model.addAttribute("comediantes", Arrays.asList(
                "Thiago Ventura",
                "Afonso Padilha",
                "Bruna Louise"));
        System.out.println("Passou pelo IndexController...");
        return "index";
    }

    // htttp://localhost:8080/soma?x=10&y=20
    @GetMapping("/soma")
    public String somaComParametrosNaRequisicao(@RequestParam("x") Integer x, 
        @RequestParam("y") Integer y) {

        System.out.printf("somaComParametrosNaRequisicao: %s + %s é = %s\n", x, y, (x + y));
        return "redirect:/";
    }

    // htttp://localhost:8080/soma/10/20
    @GetMapping("/soma/{x}/{y}")
    public String somaComParametrosNoPath(@PathVariable("x") Integer x, 
        @PathVariable("y") Integer y) {

        System.out.printf("somaComParametrosNoPath: %s + %s é = %s\n", x, y, (x + y));
        return "redirect:/";
    }

    @PostMapping
    public String post() {
        System.out.println("Passou pelo IndexController.");
        System.out.println("PostMapping");
        return "index";
    }

    @DeleteMapping
    public String delete() {
        System.out.println("Passou pelo IndexController.");
        System.out.println("DeleteMapping");
        return "index";
    }

}
