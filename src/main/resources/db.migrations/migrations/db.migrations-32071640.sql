

CREATE table blocks(
    id bigint auto_increment primary key,
     block_reason varchar(255) not null,
    block_at TIMESTAMP default current_timestamp,
    unblock_at TIMESTAMP null,
    unblock_reason varchar(255) not null,
    card_id bigint not null,
    constraint cards__blocks_fk foreign key (card_id) references cards(id) on delete cascade

) engine=InnoDB;