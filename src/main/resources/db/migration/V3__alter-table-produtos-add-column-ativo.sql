alter table produtos add ativo tinyint;
update produtos set ativo =1;
ALTER TABLE produtos MODIFY ativo TINYINT NOT NULL;