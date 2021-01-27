drop schema public cascade;

drop table users if exists;
CREATE TABLE users (
 userId bigint NOT NULL PRIMARY KEY ,
 userName varchar(255) NOT NULL UNIQUE,
 userPass varchar(255) NOT NULL,
);

drop table posts if exists;
CREATE TABLE posts (
 postId bigint NOT NULL ,
 content LONGVARCHAR NOT NULL,
 date datetime NOT NULL,
 title varchar(255) NOT NULL,
 userId bigint NOT NULL,
 PRIMARY KEY (postId),
 CONSTRAINT posts_ibfk_1 FOREIGN KEY (userId) REFERENCES users
);

drop table followers if exists ;
CREATE TABLE followers (
 followerId bigint NOT NULL ,
 userId bigint NOT NULL,
 follows bigint NOT NULL,
 PRIMARY KEY (followerId),
 CONSTRAINT followers_ibfk_1 FOREIGN KEY (userId) REFERENCES users,
 CONSTRAINT followers_ibfk_2 FOREIGN KEY (follows) REFERENCES users
);