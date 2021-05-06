package com.mono.core.service;

import com.mono.core.dto.UserDTO;

import java.util.Map;

public interface UserService {
    UserDTO isUserExist(UserDTO userDTO);
    UserDTO findRoleByUser(UserDTO userDTO);
    Object[] findUserByProperty(Map<String,Object> property, String sortExpression, String sortDirection, Integer offset, Integer limit);
    UserDTO findUserById(Integer id);
}
