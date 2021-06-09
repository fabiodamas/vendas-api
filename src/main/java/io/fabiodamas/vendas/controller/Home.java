package io.fabiodamas.vendas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Home {
    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/healthy")
    public String healthy(){
        return "healthy/index.html";
    }    
}
