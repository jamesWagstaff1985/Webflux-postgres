create table SIMPLE_ENTITY (
	id serial primary key,
	name varchar(50)
);

insert into simple_entity (name) values ('person a'), ('person b');
