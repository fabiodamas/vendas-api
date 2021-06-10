package io.fabiodamas.vendas.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name="produto")
@Data
@NoArgsConstructor
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size(min = 3, max = 45)
    private String descricao;

    @ManyToOne
    @JoinColumn(name="id_categoria")
    private Categoria categoria;    

    Integer quantidade;

}
