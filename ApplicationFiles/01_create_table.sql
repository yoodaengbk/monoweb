use travelweb;
DROP TABLE IF EXISTS `roleEntity`;
CREATE TABLE `roleEntity` (
                        `roleid` bigint NOT NULL AUTO_INCREMENT primary key,
                        `name` varchar(100)  NULL

) ;

DROP TABLE IF EXISTS userEntity;

create table userEntity (
                      `userid` bigint NOT NULL AUTO_INCREMENT primary key,
                      name varchar(255) null ,
                      password varchar(255) null ,
                      phone varchar(10) null,
                      roleid bigint ,
                      KEY `FK_USER_ROLE_idx` (`roleid`),
                      CONSTRAINT `FK_USER_ROLE` FOREIGN KEY (`roleid`) REFERENCES `roleEntity` (`roleid`) ON DELETE NO ACTION ON UPDATE NO ACTION
);

