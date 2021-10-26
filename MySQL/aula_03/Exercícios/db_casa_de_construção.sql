create database db_construindo_a_nossa_vida;
use db_construindo_a_nossa_vida;

create table tb_categoria(
	id bigint auto_increment,
    departamento varchar(100) not null,
    categoria varchar(100) not null,
	
    primary key(id)
);

create table tb_produtos(
	id bigint auto_increment,
    nome varchar(100) not null,
    preco decimal(7,2) not null,
    quantidade int not null,
    categoria_id bigint,
    
    primary key(id),
    foreign key(categoria_id) references tb_categoria(id)
);

select * from tb_produtos;

insert into tb_categoria(departamento, categoria) values("Organização da Casa", "Organização do banheiro");
insert into tb_categoria(departamento, categoria) values("Área externa", "Jardim");
insert into tb_categoria(departamento, categoria) values("Ferramentas", "Ferramentas Manuais");
insert into tb_categoria(departamento, categoria) values("Tintas", "Tintas e Corantes");
insert into tb_categoria(departamento, categoria) values("Elétrica", "Tomadas e interruptores");

insert into tb_produtos(nome, preco, quantidade, categoria_id) values('Chave Inglesa 8" PRETA', 18.90, 10, 3);
insert into tb_produtos(nome, preco, quantidade, categoria_id) values("Jogo de chave de fenda 7 PCs", 40.00, 5, 3);
insert into tb_produtos(nome, preco, quantidade, categoria_id) values("Mangueira de jardim", 59.90, 90, 2);
insert into tb_produtos(nome, preco, quantidade, categoria_id) values("Porta escova de dentes", 12.90, 4, 1);
insert into tb_produtos(nome, preco, quantidade, categoria_id) values("Conjunto tomada 2P 20A 10PCs", 99.90, 40, 5);
insert into tb_produtos(nome, preco, quantidade, categoria_id) values("Tinta Acrílica 20L BRANCO FOSCO", 289.00, 6, 4);
insert into tb_produtos(nome, preco, quantidade, categoria_id) values("Substrato simples 70L", 80.00, 10, 2);
insert into tb_produtos(nome, preco, quantidade, categoria_id) values("Porta sabonete líquido600ml", 15.90, 30, 1);

select * from tb_produtos where preco > 50;
select * from tb_produtos where preco between 3 and 60;
select * from tb_produtos where nome like "%C%";

select * from tb_produtos inner join tb_categoria
on tb_produtos.categoria_id = tb_categoria.id;

select tb_produtos.id, tb_produtos.nome, tb_categoria.categoria from tb_produtos  inner join tb_categoria
on tb_produtos.categoria_id = tb_categoria.id order by id;

select tb_produtos.id, tb_produtos.nome, tb_categoria.categoria from tb_produtos  inner join tb_categoria
on tb_produtos.categoria_id = tb_categoria.id where tb_categoria.id = 5;