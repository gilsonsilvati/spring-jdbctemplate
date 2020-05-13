create table usuario (
  id bigint not null auto_increment,
  nome varchar(100) not null,
  email varchar(100),
  primary key(id)
) engine=InnoDB;

insert into usuario (id, nome, email) values (1, 'Gilson Silva', 'gilson.teste@gmail.com');
insert into usuario (id, nome, email) values (2, 'Gabriel Alves', 'gabriel.teste@gmail.com');
insert into usuario (id, nome, email) values (3, 'Lidy Santos', 'lidy.teste@gmail.com');
insert into usuario (id, nome, email) values (4, 'Leka Alves', 'leka.teste@gmail.com');
