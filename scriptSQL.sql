drop database if exists UserRecords;
create database UserRecords;
use UserRecords;
grant all on UserRecords.* to 'root'@'localhost' identified by 'test'; 

CREATE TABLE `User` (
 `user_id` int(10) NOT NULL AUTO_INCREMENT,
 `first_name` varchar(40) NOT NULL,
 `last_name` varchar(40) NOT NULL,
 `username` varchar(100) UNIQUE NOT NULL,
 `age` integer(6) NOT NULL,
 PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=100000009;