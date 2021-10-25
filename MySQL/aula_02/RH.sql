CREATE DATABASE db_rh;

USE db_rh;

CREATE TABLE tb_funcionaries(
	id bigint auto_increment, 
    nome varchar(20) not null,
    sexo char not null,
    salario decimal(10,2) not null,
    cargo varchar(100) not null,
	matricula varchar(20) not null,
    primary key(id)
);

/*Inserindo dados na tabela*/
insert into tb_funcionaries(nome, sexo, salario, cargo, matricula) values("Leticia", "F", 1900.00, "Gerente pública", "UT834");
insert into tb_funcionaries(nome, sexo, salario, cargo, matricula) values("Ricardo", "M", 4900.00, "Desenvolvedor de software", "QOTI3");
insert into tb_funcionaries(nome, sexo, salario, cargo, matricula) values("Fernando", "M", 2500.00, "Garçon", "QA1398");
insert into tb_funcionaries(nome, sexo, salario, cargo, matricula) values("Larissa", "F", 8000.00, "Engenheira de dados", "PK345");
insert into tb_funcionaries(nome, sexo, salario, cargo, matricula) values("Leandro", "M", 1100.00, "Atendente de telemarketing", "RE4538");

select * from tb_funcionaries;

select * from tb_funcionaries where salario > 2000;

select * from tb_funcionaries where salario < 2000;

/*alterando valor do salario*/
update tb_funcionaries set salario = 2500.00 where id = 1;
update tb_funcionaries set salario = 1800.00 where id = 3;
 



