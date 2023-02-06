create database agenda;

create table contatos(

    id int not null IDENTITY PRIMARY KEY,
    nome VARCHAR(40),
    idade int,
    dataCadastro date)
