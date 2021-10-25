create database db_generation_game_online;
use db_generation_game_online;

create table  tb_cla	sse(
	id bigint auto_increment,
    nomeclasse varchar(30) not null,
	tipodeclasse varchar(20) not null,
    
    primary key(id)
);

create table tb_personagem(
	id bigint auto_increment,
    idclasse bigint,
    nome varchar(50) not null,
    ataque bigint not null,
    defesa bigint not null,
    vida decimal(6,2) not null,
	mana bigint not null,
    
    primary key(id),
    foreign key(idclasse) references tb_classe(id)
    
);

insert into  tb_classe(nomeclasse, tipodeclasse) Values ("Algoz", "Assassino");
insert into  tb_classe(nomeclasse, tipodeclasse) Values ("Ferreiro", "Mercador");
insert into  tb_classe(nomeclasse, tipodeclasse) Values ("Sarcedote", "Suporte");
insert into  tb_classe(nomeclasse, tipodeclasse) Values ("Arquimago", "Bruxos");
insert into  tb_classe(nomeclasse, tipodeclasse) Values ("Paladino", "Espadachim");

insert into tb_personagem(idclasse, nome, ataque, defesa, vida, mana) values (1, "Carrasco", 10000, 6500, 7500, 2000);
insert into tb_personagem(idclasse, nome, ataque, defesa, vida, mana) values (4, "Jaina Proudmoore", 13200, 4000, 8000, 8125);
insert into tb_personagem(idclasse, nome, ataque, defesa, vida, mana) values (3, "Papa Americano", 30000, 1000, 9000, 10125);
insert into tb_personagem(idclasse, nome, ataque, defesa, vida, mana) values (2, "Rocher", 9200, 9000, 1800, 3000);
insert into tb_personagem(idclasse, nome, ataque, defesa, vida, mana) values (1, "Al-Gûzz", 40000, 10000, 1100, 8500);
insert into tb_personagem(idclasse, nome, ataque, defesa, vida, mana) values (5, "Rei Arthur", 25000, 9000, 2500, 11500);
insert into tb_personagem(idclasse, nome, ataque, defesa, vida, mana) values (3, "Padre quemedo", 100000, 0, 500, 2);
insert into tb_personagem(idclasse, nome, ataque, defesa, vida, mana) values (5, "El Cid", 7500, 10000, 9500, 2350);
select * from tb_personagem where ataque > 2000;

select * from tb_personagem;

select * from tb_personagem where defesa between 1000 and 2000;

select * from tb_personagem where nome like '%C%';

select * from tb_personagem
inner join tb_classe on tb_classe.id = tb_personagem.idclasse;

select * from tb_personagem where idclasse = 5;

select tb_personagem.nome, tb_personagem.ataque, tb_personagem.defesa, tb_personagem.vida, tb_personagem.mana, tb_classe from tb_personagem, tb_classe;