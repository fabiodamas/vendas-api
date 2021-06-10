package io.fabiodamas.vendas.resource;


import org.springframework.web.bind.annotation.*;

import java.util.Arrays;

import java.util.List;


@RestController
@RequestMapping("/api/fornecedores")
public class FornecedorResource {
    
   @GetMapping
   public List<String> listar(){
       List<String> nomes = Arrays.asList("Papeis SA", "Carros Botucatu", "Frutas SS");
       return nomes;
   }

}
