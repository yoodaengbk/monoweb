package com.mono.command;


import com.mono.core.dto.RoleDTO;
import com.mono.core.dto.UserDTO;
import com.mono.core.web.command.AbstractCommand;

import java.util.List;

public class UserCommand extends AbstractCommand<UserDTO> {
    private List<RoleDTO> roles;
    public UserCommand() {
        this.pojo = new UserDTO();
    }

    public List<RoleDTO> getRolesl() {
        return roles;
    }

    public void setRolesl(List<RoleDTO> rolesl) {
        this.roles = rolesl;
    }
}
