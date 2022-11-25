create database db_example;
create user  'spring-demo'@'%' identified by '123456';
grant all on db_example.* to 'spring-demo'@'%'