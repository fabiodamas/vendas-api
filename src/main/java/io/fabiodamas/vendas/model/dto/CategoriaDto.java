package io.fabiodamas.vendas.model.dto;

import io.fabiodamas.vendas.model.Categoria;
import lombok.Getter;
import lombok.Setter;



@Getter
@Setter
public class CategoriaDto {
    private Long id;
    private String nome; 

    public CategoriaDto(Categoria categoria){
        this.id = categoria.getId();
        this.nome = categoria.getNome();
    }

}
