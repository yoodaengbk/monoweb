package com.mono.core.service.impl;

import com.mono.core.dao.RoleDao;
import com.mono.core.daoimpl.RoleDaoimpl;
import com.mono.core.dto.RoleDTO;
import com.mono.core.persistence.entity.RoleEntity;
import com.mono.core.service.RoleService;
import com.mono.core.utils.RoleBeanUtil;

import java.util.ArrayList;
import java.util.List;

public class RoleServiceimpl implements RoleService {
    RoleDao roleDao = new RoleDaoimpl();

    public List<RoleDTO> findAll() {
        List<RoleEntity> entities = roleDao.findAll();
        List<RoleDTO> dtos = new ArrayList<RoleDTO>();
        for (RoleEntity entity : entities) {
            dtos.add(RoleBeanUtil.entity2DTO(entity));
        }
        return dtos;
    }
}
