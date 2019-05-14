CREATE TABLE question
(
    id int AUTO_INCREMENT PRIMARY KEY,
    title varchar(100),
    description text,
    creator int,
    comment_count int DEFAULT 0,
    view_count int DEFAULT 0,
    like_count int DEFAULT 0,
    tag varchar(256),
    gmt_create bigint,
    gmt_modified bigint
);