package com.mono.core.dto;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

public class RoleDTO {

    private Integer roleId;
    private String name;
    private List<UserDTO> userDTOListList;

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<UserDTO> getUserDTOListList() {
        return userDTOListList;
    }

    public void setUserDTOListList(List<UserDTO> userDTOListList) {
        this.userDTOListList = userDTOListList;
    }
}
