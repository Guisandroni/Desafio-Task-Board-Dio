package org.dev.gui.persistence.entity;

import lombok.Data;

import java.time.OffsetDateTime;


@Data
public class BlockEntity {

    private long id;
    private OffsetDateTime blockedAt;
    private String blockReason;
    private OffsetDateTime unblockdAt;
    private String unblockReason;

}
