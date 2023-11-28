create table pacientes (

    id bigserial,
    nome varchar(100) not null,
    cpf varchar(20) not null,
    sexo varchar(20) not null,
    contato varchar(30) not null,
    peso double precision not null,
    altura double precision not null,
    imc double precision not null,
    raca varchar(20) not null,
    ativo BOOLEAN not null,

    primary key(id)
);

create table enderecos (

    id bigserial,
    cidade varchar(100) not null,
    bairro varchar(100) not null,
    logradouro varchar(100) not null,
    numero INT not null,

    primary key(id)
);

create table quadros_clinicos (

    id bigserial,
    plano_de_saude BOOLEAN not null,
    hipertenso BOOLEAN not null,
    insulino BOOLEAN not null,
    cds BOOLEAN not null,
    ca BOOLEAN not null,
    amg BOOLEAN not null,
    diabetico BOOLEAN not null,
    teve_covid BOOLEAN not null,
    complicacoes_covid BOOLEAN not null,
    pa BOOLEAN not null,

    primary key(id)
);