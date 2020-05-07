create database gradle;

use gradle;

create table users (
    `uid` bigint(20) NOT NULL COMMENT 'uid',
    `nick` varchar(20) NOT NULL COMMENT '昵称',
    PRIMARY KEY (`uid`)
) ENGINE=InnoDB COMMENT '用户表';

insert into users(uid, nick) values (1, '张三');
insert into users(uid, nick) values (2, '李四');