package com.mono.core.dao;

import com.mono.core.data.dao.GenericDao;
import com.mono.core.persistence.entity.UserEntity;

public interface UserDao extends GenericDao<Integer, UserEntity> {
    UserEntity isUserExist(String username,String password);
    UserEntity findRoleByUser(String username,String password);
}
