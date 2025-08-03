package org.dev.gui.dto;

import java.time.OffsetDateTime;

public record DetailsCard (Long id,
                           String title,
                           String description,
                           boolean blocked,
                           OffsetDateTime blockedAt,
                           String blockReason,
                           int blocksAmount,
                           Long columnId,
                           String columnName){
}
