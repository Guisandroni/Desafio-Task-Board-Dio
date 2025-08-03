package org.dev.gui.dto;

import java.util.List;

public record BoardDetails(Long id,
                           String name,
                           List<BoardColumnDTO> columns){
}
