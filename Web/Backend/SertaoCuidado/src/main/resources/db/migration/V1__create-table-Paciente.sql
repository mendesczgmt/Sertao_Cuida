create table Paciente (

    id bigserial,
    nome varchar(100) not null,
    cpf varchar(20) not null,
    sexo varchar(20) not null,
    contato varchar(30) not null,
    cidade varchar(30) not null,
    bairro varchar(40) not null,
    logradouro varchar(30) not null,
    numero INT not null,
    peso double precision not null,
    altura double precision not null,
    imc double precision not null,
    raca varchar(20) not null,
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
    ativo BOOLEAN not null,

    primary key(id)
);