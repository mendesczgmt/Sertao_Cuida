create table medicos(
    id bigserial not null,
    nome varchar(100) not null,
    cpf varchar(20) not null unique,
    crm varchar(13) not null unique,
    email varchar(100) not null unique,


    primary key(id)
);