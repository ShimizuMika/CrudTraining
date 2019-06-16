create database training default character set utf8mb4;
create user suser@localhost identified by 'pass';
grant all on training.* to suser@localhost;
flush privileges;
