create table game_chart(
gcNum int UNSIGNED AUTO_INCREMENT PRIMARY key,
gcName varchar(40) not null,
gcPrice int UNSIGNED not null default 0,
gcVender varchar(30) not null,
gcOrder int UNSIGNED not null default 1,
gcDesc varchar(2000),
gcImg varchar(1000)
);

select * from game_chart;