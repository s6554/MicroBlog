drop schema public cascade;

drop table if exists users;
CREATE TABLE `users` (
 `userId` bigint(20) NOT NULL AUTO_INCREMENT,
 `userName` varchar(60) NOT NULL,
 `userPass` varchar(60) NOT NULL,
 PRIMARY KEY (`userId`)
);

drop table if exists posts;
CREATE TABLE `posts` (
 `postId` bigint(20) NOT NULL AUTO_INCREMENT,
 `content` longtext NOT NULL,
 `date` datetime NOT NULL,
 `title` varchar(255) NOT NULL,
 `userId` bigint(20) NOT NULL,
 PRIMARY KEY (`postId`),
 KEY `userId` (`userId`),
 CONSTRAINT `posts_ibfk_1` FOREIGN KEY (`userId`) REFERENCES `users` (`userId`)
);

drop table if exists followers;
CREATE TABLE `followers` (
 `followerId` bigint(20) NOT NULL AUTO_INCREMENT,
 `userId` bigint(20) NOT NULL,
 `follows` bigint(20) NOT NULL,
 PRIMARY KEY (`followerId`),
 KEY `userId` (`userId`),
 KEY `follows` (`follows`),
 CONSTRAINT `followers_ibfk_1` FOREIGN KEY (`userId`) REFERENCES `users` (`userId`),
 CONSTRAINT `followers_ibfk_2` FOREIGN KEY (`follows`) REFERENCES `users` (`userId`)
);