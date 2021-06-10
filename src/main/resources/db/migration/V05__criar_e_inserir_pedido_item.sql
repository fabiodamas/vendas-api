CREATE TABLE pedido_item(
     id BIGINT(20) PRIMARY KEY auto_increment
     ,id_pedido BIGINT(20)
     ,id_produto BIGINT(20)     
     ,valor DECIMAL(19,2)
     ,FOREIGN KEY (id_pedido) REFERENCES pedido(id)
     ,FOREIGN KEY (id_produto) REFERENCES produto(id)
) ;


INSERT INTO pedido_item
            (id_pedido, id_produto, valor)
     VALUES (1, 1, 23.3),
            (1, 2, 45.5), 
            (2, 1, 23.3), 
            (2, 2, 45.5), 
            (2, 3, 35.7), 
            (3, 4, 75.3);
