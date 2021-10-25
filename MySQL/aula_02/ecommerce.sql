create database db_ecommerce;
use db_ecommerce;

create table tb_produtos(
	id bigint auto_increment,
    nome varchar(100) not null,
    categoria varchar(100) not null,
    preco decimal(10,2) not null,
    
    primary key(id)
);

insert into tb_produtos(nome, categoria, preco) values("Carregador", "Acessórios para celular", 150.00);
insert into tb_produtos(nome, categoria, preco) values("Vassoura", "Itens domésticos", 20.00);
insert into tb_produtos(nome, categoria, preco) values("Microfone", "Acessório de informática", "1000.00");
insert into tb_produtos(nome, categoria, preco) values("Teclado", "Acessório de informática", "800.00");
insert into tb_produtos(nome, categoria, preco) values("produto2", "categoria2", 1000.00);
insert into tb_produtos(nome, categoria, preco) values("produto3", "categoria3", 2000.00);
insert into tb_produtos(nome, categoria, preco) values("produto4", "categoria4", 3000.00);
insert into tb_produtos(nome, categoria, preco) values("produto5", "categoria5", 4000.00);

select * from tb_produtos;
select * from tb_produtos where preco > 500;
select * from tb_produtos where preco < 500;

update tb_produtos set preco = 100.00 where id = 5;
