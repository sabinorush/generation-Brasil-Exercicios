create database db_cursoDaMinhaVida;
use db_cursoDaMinhaVida;

create table tb_categorias(
	id bigint auto_increment,
    categorias varchar(100) not null,
    
    primary key(id)
);

create table tb_produtos(
	id bigint auto_increment,
    nome varchar(100) not null,
    preco decimal(7,2) not null,
	duracao varchar(50) not null,
    categoria_id bigint,
    
    primary key(id),
    foreign key(categoria_id) references tb_categorias(id)
);

select * from tb_produtos;

insert into tb_categorias(categorias) values("Administração e Negócios");
insert into tb_categorias(categorias) values("Ciências Exatas");
insert into tb_categorias(categorias) values("Direito");
insert into tb_categorias(categorias) values("Idioma");
insert into tb_categorias(categorias) values("Música");

insert into tb_produtos(nome, preco, duracao, categoria_id) values("Direito Civil", 1200.00, "4 Semestres", 3);
insert into tb_produtos(nome, preco, duracao, categoria_id) values("Física, básica ao avançado", 4400.00, "8 Semestres", 2);
insert into tb_produtos(nome, preco, duracao, categoria_id) values("Inglês Perfeito", 3900.00, "12 meses", 4);
insert into tb_produtos(nome, preco, duracao, categoria_id) values("Canto Funcional", 900.00, "1 semestre", 5);
insert into tb_produtos(nome, preco, duracao, categoria_id) values("Gestão de pessoas", 380.00, "86 horas", 1);
insert into tb_produtos(nome, preco, duracao, categoria_id) values("Espanhol Perfeito", 2000.00, "12 meses", 4);
insert into tb_produtos(nome, preco, duracao, categoria_id) values("Física Geral I", 20.00, " 30 horas", 2);
insert into tb_produtos(nome, preco, duracao, categoria_id) values("Contra-Baixo Iniciante", 30.00, "12 horas", 5);

select * from tb_produtos where preco > 50;
select * from tb_produtos where preco between 3 and 60;
select * from tb_produtos where nome like "%j%";

select * from tb_produtos inner join tb_categorias
on tb_produtos.categoria_id = tb_categoriaS.id;


select tb_produtos.id, tb_produtos.nome, tb_categorias.categorias from tb_produtos  inner join tb_categorias
on tb_produtos.categoria_id = tb_categorias.id where tb_categorias.id = 2;