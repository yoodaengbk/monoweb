package com.mono.core.service.impl;

import com.mono.core.dao.UserDao;
import com.mono.core.daoimpl.UserDaoimpl;
import com.mono.core.dto.UserDTO;
import com.mono.core.persistence.entity.UserEntity;
import com.mono.core.service.UserService;
import com.mono.core.utils.UserBeanUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class UserServiceimpl implements UserService {
    UserDao userDao = new UserDaoimpl();
    public UserDTO isUserExist(UserDTO userDTO) {

        UserEntity entity = userDao.isUserExist(userDTO.getName(),userDTO.getPassword());

        return UserBeanUtil.entity2DTO(entity);
    }

    public UserDTO findRoleByUser(UserDTO userDTO) {
        UserEntity entity = userDao.findRoleByUser(userDTO.getName(),userDTO.getPassword());

        return UserBeanUtil.entity2DTO(entity);
    }

    public Object[] findUserByProperty(Map<String, Object> property, String sortExpression, String sortDirection, Integer offset, Integer limit) {
        Object[] objects = userDao.findByProperty(property,sortExpression,sortDirection,offset,limit);
        List<UserDTO> list = new ArrayList<UserDTO>();
        for(UserEntity entity : (List<UserEntity>) objects[0]){
            list.add(UserBeanUtil.entity2DTO(entity));
        }
        objects[0]=list;
        return objects;
    }

    public UserDTO findUserById(Integer id) {
        UserEntity entity = userDao.findById(id);

        return UserBeanUtil.entity2DTO(entity);
    }
}
