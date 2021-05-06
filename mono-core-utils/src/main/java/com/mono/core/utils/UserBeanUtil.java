package com.mono.core.utils;

import com.mono.core.dto.UserDTO;
import com.mono.core.persistence.entity.UserEntity;

public class UserBeanUtil {
    public static UserDTO entity2DTO(UserEntity userEntity) {
        UserDTO userDTO = new UserDTO();
        userDTO.setUserId(userEntity.getUserId());
        userDTO.setName(userEntity.getName());
        userDTO.setPassword(userEntity.getPassword());
        userDTO.setPhone(userEntity.getPhone());
        userDTO.setRoleDTO(RoleBeanUtil.entity2DTO(userEntity.getRoleEntity()));
        return userDTO;
    }
    public static UserEntity dto2Entity(UserDTO userDTO) {
        UserEntity userEntity = new UserEntity();
        userEntity.setUserId(userDTO.getUserId());
        userEntity.setName(userDTO.getName());
        userEntity.setPassword(userDTO.getPassword());
        userEntity.setPhone(userDTO.getPhone());
        userEntity.setRoleEntity(RoleBeanUtil.dto2Entity(userDTO.getRoleDTO()));
        return userEntity;
    }
}
