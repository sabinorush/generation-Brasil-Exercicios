create database db_escola;
use db_escola;

create table tb_estudantes(
	id bigint auto_increment,
    nome varchar(100) not null,
    email varchar(100) not null,
    turma varchar(20) not null,
    sala int,
    nota int,
    
    primary key(id)
 );

INSERT INTO tb_estudantes (nome, email, turma, sala, nota) VALUES ("Ricaro Gomes", "Ricargomes@yahoo.com.br", "3A", 12, 9.0);
INSERT INTO tb_estudantes (nome, email, turma, sala, nota) VALUES ("Thiago da Silva", "tirasgosilva@hotmail.com", "1A", 13, 7.0);
INSERT INTO tb_estudantes (nome, email, turma, sala, nota) VALUES ("Guilherme Piloto", "PilotoG@outlook.com", "2B", 28, 6.0);
INSERT INTO tb_estudantes (nome, email, turma, sala, nota) VALUES ("Matheus Oliveira", "theuzin@yahoo.com.br", "3C", 14, 5.0);
INSERT INTO tb_estudantes (nome, email, turma, sala, nota) VALUES ("Lucas Pinheiro", "Luquete@bol.com.br", "3A", 12, 4.0);
INSERT INTO tb_estudantes (nome, email, turma, sala, nota) VALUES ("Otavio Augusto", "Outavin@gmail.com", "3C", 14, 4.5);
INSERT INTO tb_estudantes (nome, email, turma, sala, nota) VALUES ("Ellis Regina", "ellizinha@hotmail.com", "2A", 26, 8.3);

SELECT * FROM tb_estudantes;
SELECT * FROM tb_estudantes WHERE nota > 7;
SELECT * FROM tb_estudantes WHERE nota < 7;

UPDATE tb_estudantes SET nota = 9.00 WHERE id = 4;