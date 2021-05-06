package com.mono.command;

import com.mono.core.dto.RoleDTO;

import com.mono.core.web.command.AbstractCommand;

public class RoleCommand extends AbstractCommand<RoleDTO> {
    public RoleCommand() {
        this.pojo = new RoleDTO();
    }
}
