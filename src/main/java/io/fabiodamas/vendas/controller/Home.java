package io.fabiodamas.vendas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Home {
    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/health")
    public String healthy(){
        return "health/index.html";
    }    
}
