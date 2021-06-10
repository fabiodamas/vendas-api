package io.fabiodamas.vendas.model;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import io.fabiodamas.vendas.model.dto.CategoriaDto;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name="categoria")
@Data
@NoArgsConstructor
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size(min = 3, max = 45)
    private String nome;

    private Integer quantidadeMinima;

    private Integer quantidadeMaxima;    

    public CategoriaDto converter(Categoria c){
        CategoriaDto categoriaDto = new CategoriaDto(c);
        return categoriaDto;
    }

}
