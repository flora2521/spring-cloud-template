DROP TABLE IF EXISTS user;

CREATE TABLE user
(
    id BIGINT(20) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
    name VARCHAR(30) NULL DEFAULT NULL COMMENT '姓名',
    password VARCHAR(30) NULL DEFAULT NULL COMMENT '密码',
    PRIMARY KEY (id)
);