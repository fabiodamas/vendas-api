CREATE TABLE produto(
     id BIGINT(20) PRIMARY KEY auto_increment
     ,id_categoria int
     ,descricao VARCHAR(45) NOT NULL
     ,quantidade int
     ,FOREIGN KEY (id_categoria) REFERENCES categoria(id)
) ;


INSERT INTO produto
            (id_categoria, descricao, quantidade)
     VALUES (4, 'celular', 10),
            (4, 'monitor', 30), 
            (3, 'camisa', 80),
            (3, 'blusa', 40);
