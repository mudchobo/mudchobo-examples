create table hello (
id bigint not null auto_increment,
world varchar(255),
primary key (id)
) engine=MyISAM;

INSERT INTO `slave`.`hello` (`world`) VALUES ('jared.s');
