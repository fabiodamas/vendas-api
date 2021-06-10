package io.fabiodamas.vendas.model;


import java.math.BigDecimal;

import javax.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name="pedido_item")
@Data
@NoArgsConstructor
public class PedidoItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name="id_pedido")
    private Pedido pedido;

    @ManyToOne
    @JoinColumn(name="id_produto")
    private Produto produto;

    private BigDecimal valor;
}
