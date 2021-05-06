package com.mono.command;

import com.mono.core.dto.TourDTO;
import com.mono.core.web.command.AbstractCommand;

public class TourCommand extends AbstractCommand<TourDTO> {
    public TourCommand() {
        this.pojo = new TourDTO();
    }
}
