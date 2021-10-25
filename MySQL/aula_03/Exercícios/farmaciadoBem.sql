create database db_farmacia_do_bem;
use  db_farmacia_do_bem;

create table tb_categoria(
	id bigint auto_increment,
	categoria varchar(255),
	primary key (id)
);

create table tb_produto(
id bigint auto_increment,
nome varchar(100),
preco decimal(7,2),
quantidade bigint,
categoria_id bigint,
primary key (id),
foreign key (categoria_id) references tb_categoria(id)
);

insert into tb_categoria(categoria) values ("Beleza");
insert into tb_categoria(categoria) values ("Higiene");
insert into tb_categoria(categoria) values ("Suplemento");
insert into tb_categoria(categoria) values ("Cosmético");
insert into tb_categoria(categoria) values ("Medicamento");

insert into tb_produto(nome, preco, quantidade, categoria_id) values ("produto1", 30.70, 200, 1);
insert into tb_produto(nome, preco, quantidade, categoria_id) values ("produto2", 100.00, 50, 2);
insert into tb_produto(nome, preco, quantidade, categoria_id) values ("produto3", 300.00, 10, 3);
insert into tb_produto(nome, preco, quantidade, categoria_id) values ("produto4", 15.30, 120, 4);
insert into tb_produto(nome, preco, quantidade, categoria_id) values ("produto5", 12.40, 153, 5);
insert into tb_produto(nome, preco, quantidade, categoria_id) values ("produto6", 210.00, 30, 3);
insert into tb_produto(nome, preco, quantidade, categoria_id) values ("produto7", 3.00, 20, 2);
insert into tb_produto(nome, preco, quantidade, categoria_id) values ("produto8", 143.00, 15, 5);

select * from tb_produto;

select * from tb_produto where preco > 50.0;

select * from tb_produto where preco between 3 and 60;

select * from tb_produto where nome like "%B%";

select * from tb_produto inner join tb_categoria 
on tb_produto.categoria_id = tb_categoria.id where tb_categoria.id = 2;


