create table produtos(

    id bigint not null auto_increment,
    nome varchar(100) not null,
    quantidade varchar(100) not null,
    codigo varchar(6) not null unique,
    qualidade varchar(100) not null,

    -- Dados do Fornecedor embutido
    nome_Fornecedor varchar(100) not null,
    email varchar(100) not null,
    telefone varchar(11),
    crm varchar(6) not null unique,

    -- Dados do Endereco embutido
    complemento varchar(100),
    numero varchar(20),
    cep varchar(9) not null,
    uf char(2) not null,
    cidade varchar(100) not null,
    bairro varchar(100) not null,

    primary key(id)

);