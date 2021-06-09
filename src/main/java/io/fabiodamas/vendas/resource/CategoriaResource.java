package io.fabiodamas.vendas.resource;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/categorias")
@ApiOperation(value = "Controle de Categorias", notes = "")
public class CategoriaResource {
 
    @GetMapping
    public  String listar(){
        return "Categoria Teste";
    }

}
