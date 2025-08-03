package org.dev.gui.dto;

import org.dev.gui.persistence.entity.BoardColumnKindEnum;

public record BoardColumnInfo (Long id, int order, BoardColumnKindEnum kind){
}

