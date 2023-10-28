-- ---------------------------
create database springcrud;
use springcrud;

create table pvdr_spring(
	id_prov int primary key,
    nom_prov varchar(50)
);

create table ctga_spring(
	id_cate int primary key,
    nom_cate varchar(50)
);

create table pdto_spring(
	id_prod int primary key,
    nom_prod varchar(50),
    pre_prod decimal,
    stock int,
    id_prov int,
    id_cate int,
    foreign key (id_prov) references pvdr_spring(id_prov),
    foreign key (id_cate) references ctga_spring(id_cate)
);

insert into pvdr_spring values(101,'Alicorp');
insert into pvdr_spring values(102,'Costeño');
insert into pvdr_spring values(103,'GLoria');
insert into pvdr_spring values(104,'Sapolio');
insert into pvdr_spring values(105,'Coca Cola');

insert into ctga_spring values(101,'Pastas');
insert into ctga_spring values(102,'Cereales');
insert into ctga_spring values(103,'Leche');
insert into ctga_spring values(104,'Limpieza');
insert into ctga_spring values(105,'Gaseosa');

insert into pdto_spring values(101,'Pastas Alicorp 300g',29.99,10,101,101);
insert into pdto_spring values(102,'Arroz Costeño 1k',39.99,10,102,102);
insert into pdto_spring values(103,'Leche Gloria 500g',19.99,10,103,103);
insert into pdto_spring values(104,'Sapolio QuitaGrasa 250g',9.99,10,104,104);
insert into pdto_spring values(105,'Coca cola 1L',15.99,10,105,105);

select * from pvdr_spring;
select * from ctga_spring;
select * from pdto_spring;


