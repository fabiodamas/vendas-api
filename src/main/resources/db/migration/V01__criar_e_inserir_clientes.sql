CREATE TABLE cliente
  (
        id BIGINT(20) PRIMARY KEY auto_increment
     ,nome VARCHAR(50) NOT NULL
     ,ativo BOOLEAN
) ;

ALTER TABLE cliente ADD logradouro VARCHAR(30);
ALTER TABLE cliente ADD numero VARCHAR(30);
ALTER TABLE cliente ADD complemento VARCHAR(30);
ALTER TABLE cliente ADD bairro VARCHAR(30);
ALTER TABLE cliente ADD cep VARCHAR(30);
ALTER TABLE cliente ADD cidade VARCHAR(30);
ALTER TABLE cliente ADD estado VARCHAR(30);

INSERT INTO cliente
            (nome, ativo)
     VALUES ('amelia', true),
            ('bruna', true),
            ('carla', true),
            ('daniel', true),
            ('elaine', true),
            ('fabio', true),
            ('gustavo', true),
            ('helton', true),
            ('ilda', true),
            ('juliano', true),
            ('ludmila', true),
            ('marcia', true);

INSERT INTO cliente (NOME, ATIVO, BAIRRO, CEP, CIDADE, COMPLEMENTO, ESTADO, LOGRADOURO, NUMERO)
 VALUES ('JOAO', TRUE, 'CENTRO', '01151000', 'SAO PAULO', 'APT 110', 'SP', 'AVENIDA X', 101);