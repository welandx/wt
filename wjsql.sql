create database WJ;
use WJ;
create table user(
	id int PRIMARY KEY,
	username CHAR(12),
    password CHAR(16)
)ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
drop table WJ;
insert into user (username,password) values ('admin','123');
select * from user;
create table employee(
	id int(11) NOT NULL AUTO_INCREMENT PRIMARY KEY,
	ep_name varchar(255) NOT NULL DEFAULT '',
	wage varchar(255) DEFAULT '',
	cid int(11) DEFAULT NULL,
	KEY ep_cid (cid),
  	CONSTRAINT ep_cid FOREIGN KEY (cid) REFERENCES category (id) ON DELETE SET NULL ON UPDATE CASCADE
)ENGINE=InnoDB AUTO_INCREMENT=102 DEFAULT CHARSET=utf8;
CREATE TABLE category (
  id int(11) NOT NULL,
  name varchar(255) NOT NULL,
  PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
