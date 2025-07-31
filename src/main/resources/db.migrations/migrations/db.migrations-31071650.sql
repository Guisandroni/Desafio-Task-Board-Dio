

CREATE table cards(
                       id bigint auto_increment primary key,
                       title varchar(255) not null,
                       description varchar(255) not null,
                       board_column_id bigint not null,
                       constraint boards__columns_cards_fk foreign key (board_column_id) references boards_Columns(id) on delete cascade
) engine=InnoDB;