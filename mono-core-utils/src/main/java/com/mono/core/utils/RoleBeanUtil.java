package com.mono.core.utils;

import com.mono.core.dto.RoleDTO;
import com.mono.core.persistence.entity.RoleEntity;

public class RoleBeanUtil {
    public static RoleDTO entity2DTO(RoleEntity roleEntity){
        RoleDTO roleDTO = new RoleDTO();
        roleDTO.setRoleId(roleEntity.getRoleId());
        roleDTO.setName(roleEntity.getName());
        return  roleDTO;
    }

    public static RoleEntity dto2Entity(RoleDTO roleDTO){
        RoleEntity roleEntity = new RoleEntity();
        roleEntity.setRoleId(roleDTO.getRoleId());
        roleEntity.setName(roleDTO.getName());
        return  roleEntity;
    }
}
