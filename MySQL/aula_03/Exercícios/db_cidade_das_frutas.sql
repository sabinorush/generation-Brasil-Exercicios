create database db_cidade_das_frutas;
use db_cidade_das_frutas;

create table tb_categoria(
	id bigint auto_increment,
    categoria varchar(100) not null,
    
    primary key(id)
);

create table tb_produto(
	id bigint auto_increment,
    nome varchar(100) not null,
    preco_kg decimal(7,2) not null,
    categoria_id bigint,
    
    primary key(id),
    foreign key(categoria_id) references tb_categoria(id)
);

select * from tb_produto;

insert into tb_categoria(categoria) values("Fruta");
insert into tb_categoria(categoria) values("Legume");
insert into tb_categoria(categoria) values("Fruta");
insert into tb_categoria(categoria) values("Verdura");
insert into tb_categoria(categoria) values("Fruta");

insert into tb_produto(nome, preco_kg, categoria_id) values("Caju", 12.00, 3);
insert into tb_produto(nome, preco_kg, categoria_id) values("Brocólis", 8.00, 2);
insert into tb_produto(nome, preco_kg, categoria_id) values("Framboesa", 63.00, 3);
insert into tb_produto(nome, preco_kg, categoria_id) values("Fruta Pão", 78.00, 1);
insert into tb_produto(nome, preco_kg, categoria_id) values("Goiaba", 8.99, 5);
insert into tb_produto(nome, preco_kg, categoria_id) values("Maça turma da mônica", 8.40, 4);
insert into tb_produto(nome, preco_kg, categoria_id) values("Ameixa", 40.00, 3);
insert into tb_produto(nome, preco_kg, categoria_id) values("Cebola",  1.25, 2);

select * from tb_produto where preco > 50;

select * from tb_produto where preco_kg between 3 and 60;

select * from tb_produto where nome like "%C%";

select * from tb_produto inner join tb_categoria
on tb_produto.categoria_id = tb_categoria.id;

select tb_produto.id, tb_produto.nome, tb_categoria.categoria, tb_produto.preco_kg from tb_produto  inner join tb_categoria
on tb_produto.categoria_id = tb_categoria.id order by id;

select tb_produto.id, tb_produto.nome, tb_categoria.categoria from tb_produto  inner join tb_categoria
on tb_produto.categoria_id = tb_categoria.id where tb_categoria.id = 2;