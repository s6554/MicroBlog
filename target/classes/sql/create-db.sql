drop schema public cascade ;
drop table User if exists ;
create table User (
	UserID INTEGER NOT NULL PRIMARY KEY,
	UserName VARCHAR(255),
	UserPassword VARCHAR(255)
);


/*
drop table follower if exists ;
create table follower (
….
);
drop table post if exists ;
create table post (
…..
);
*/