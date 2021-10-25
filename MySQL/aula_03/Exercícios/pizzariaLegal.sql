create database db_pizzaria_legal;
use db_pizzaria_legal;

create table tb_categoria(
	id bigint auto_increment,
    categoria varchar(100) not null,
    tamanho varchar(100),
    
    primary key(id)
);

create table tb_pizza(
	id bigint auto_increment,
    nome varchar(100) not null,
	borda varchar(100),
    preco decimal(7,2) not null,
    categoria_id bigint,
    
    primary key(id),
    foreign key(categoria_id) references tb_categoria(id)
);

select * from tb_pizza;

insert into tb_categoria(categoria, tamanho) values("Salgada", "Broto");
insert into tb_categoria(categoria, tamanho) values("Salgada", "Média");
insert into tb_categoria(categoria, tamanho) values("Salgada", "Grande");
insert into tb_categoria(categoria, tamanho) values("Doce", "Broto");
insert into tb_categoria(categoria, tamanho) values("Doce", "Média");

insert into tb_pizza(nome, borda, preco, categoria_id) values("Marguerita", "Simples", 40.00, 3);
insert into tb_pizza(nome, borda, preco, categoria_id) values("Brocólis", "Simples", 50.00, 2);
insert into tb_pizza(nome, borda, preco, categoria_id) values("Portuguesa", "Recheada", 47.00, 3);
insert into tb_pizza(nome, borda, preco, categoria_id) values("Mussarela com bacon", "Simples", 15.00, 1);
insert into tb_pizza(nome, borda, preco, categoria_id) values("Brigadeiro com morango", "Simples", 43.50, 5);
insert into tb_pizza(nome, borda, preco, categoria_id) values("Prestígio", "Simples", 50.00, 4);
insert into tb_pizza(nome, borda, preco, categoria_id) values("Shimeji", "Simples", 35.00, 3);
insert into tb_pizza(nome, borda, preco, categoria_id) values("Frango com catupiry", "Recheada", 25.00, 2);

select * from tb_pizza where preco < 45;

select * from tb_pizza where preco between 29 and 60;

select * from tb_pizza where nome like "%C%";

select * from tb_pizza inner join tb_categoria
on tb_pizza.categoria_id = tb_categoria.id;

select tb_pizza.id, tb_pizza.nome, tb_categoria.categoria from tb_pizza  inner join tb_categoria
on tb_pizza.categoria_id = tb_categoria.id order by id;

select tb_pizza.id, tb_pizza.nome, tb_categoria.categoria from tb_pizza  inner join tb_categoria
on tb_pizza.categoria_id = tb_categoria.id where tb_categoria.id = 3;