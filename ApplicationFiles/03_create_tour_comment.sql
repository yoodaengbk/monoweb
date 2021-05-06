use travelweb;
create table tourEntity (
                      tourid integer NOT NULL AUTO_INCREMENT primary key,
                      title varchar(512) null ,
                      destinations varchar(255) null ,
                      start varchar(255) null,
                      cost bigint null,
                      time integer null,
                      image varchar(255) null,
                      content text null
);
create table comment (
                         commentid bigint not null primary key  auto_increment,
                         content text null,
                         userid bigint null,
                         tourid integer null,
                         createddate timestamp null
)
create table cart (
                         cartid bigint not null primary key  auto_increment,
                         userid bigint null,
                         tourid integer null,
                         createddate timestamp null
)