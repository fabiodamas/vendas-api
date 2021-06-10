package io.fabiodamas.vendas.model;

import java.time.LocalDate;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name="pedido")
@Data
@NoArgsConstructor
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private LocalDate dataPedido;    

    @ManyToOne
    @JoinColumn(name="id_cliente")
    private Cliente cliente;

    @NotNull
    @Enumerated(EnumType.STRING)
    private StatusPedido status_pedido;

}
