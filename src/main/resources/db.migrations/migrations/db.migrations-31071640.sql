

CREATE table boards_Columns(
                       id bigint auto_increment primary key,
                       name varchar(255) not null,
                       `order` int not null,
                       kind varchar(7) not null,
                       board_id bigint not null,
                       constraint boards__boards_columns_fk foreign key (board_id) references boards(id),
                       CONSTRAINT id_order_uk unique key unique_board_id_order (board_id, `order`)
) engine=InnoDB;