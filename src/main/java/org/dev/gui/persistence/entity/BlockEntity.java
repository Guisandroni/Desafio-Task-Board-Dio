package org.dev.gui.persistence.entity;

import lombok.Data;

import java.time.OffsetDateTime;

// entidades: tabelas do bd
@Data
public class BlockEntity {

    private long id;
    private OffsetDateTime blockedAt;
    private String blockReason;
    private OffsetDateTime unblockdAt;
    private String unblockReason;

}
