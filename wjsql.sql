create database WJ;
use WJ;
create table user(
	id int PRIMARY KEY,
	username CHAR(12),
    password CHAR(16)
);
drop table WJ;
insert into user (username,password) values ('admin','123');
select * from user;