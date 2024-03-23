create database crud;
use crud;
create table students
(
    id        int auto_increment primary key,
    FirstName varchar(25) not null,
    LastName  varchar(25) not null,
    Course    varchar(25) not null

);
insert into students (FirstName, LastName, Course)
values ('Luis Fernando','Garcia','Java');
