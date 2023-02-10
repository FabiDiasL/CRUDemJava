create database agenda;

create table contatos(

    id int not null AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(40),
    idade int,
    dataCadastro date)
