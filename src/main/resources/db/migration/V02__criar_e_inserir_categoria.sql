CREATE TABLE categoria
  (
        id BIGINT(20) PRIMARY KEY auto_increment
     ,nome VARCHAR(50) NOT NULL
     ,quantidade_minima int
     ,quantidade_maxima int
) ;


INSERT INTO categoria
            (nome)
     VALUES ('refrigerante'),
            ('salgado'),
            ('vestimenta'),
            ('eletrônico');
 