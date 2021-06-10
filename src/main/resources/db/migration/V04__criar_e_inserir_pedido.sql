CREATE TABLE pedido(
     id BIGINT(20) PRIMARY KEY auto_increment
     ,id_cliente BIGINT(20)
     ,data_pedido date
     ,status_pedido varchar(50)
     ,FOREIGN KEY (id_cliente) REFERENCES cliente(id)
) ;


INSERT INTO pedido
            (id_cliente, data_pedido, status_pedido)
     VALUES (1, '2021-06-09', 'ABERTO'),
            (2, '2021-06-09', 'CANCELADO'), 
            (3, '2021-06-09', 'FATURADO');
