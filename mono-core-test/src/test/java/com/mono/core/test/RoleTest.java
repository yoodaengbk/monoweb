package com.mono.core.test;

import com.mono.core.dao.RoleDao;
import com.mono.core.dao.TourDao;
import com.mono.core.daoimpl.RoleDaoimpl;
import com.mono.core.daoimpl.TourDaoimpl;
import com.mono.core.persistence.entity.RoleEntity;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RoleTest {
    @Test
    public void checkFindAll() {
        RoleDao roleDao = new RoleDaoimpl() ;
        List<RoleEntity> list = roleDao.findAll();
    }

    @Test
    public void checkUpdateRole() {
        RoleDao roleDao = new RoleDaoimpl();
        RoleEntity roleEntity = new RoleEntity();
        roleEntity.setRoleId(2);
        roleEntity.setName("USER");
        roleDao.update(roleEntity);
    }
    @Test
    public void checkSaveRole() {
        RoleDao roleDao = new RoleDaoimpl();
        RoleEntity roleEntity = new RoleEntity();
        roleEntity.setRoleId(1);
        roleEntity.setName("ADMIN");
        roleDao.save(roleEntity);
    }

    @Test
    public void checkFindByIdRole() {
        RoleDao roleDao = new RoleDaoimpl();
        RoleEntity roleEntity = roleDao.findById(2);

    }

    @Test
    public void checkFindByIdProperty() {
//        String property = null;
        Map<String,Object> property = new HashMap<>();
//        property.put("title","Titile 2");
//        property.put("content","Content 2");

        String sortExpression = null;
        String sortDirecton = null;
        TourDao tourDao = new TourDaoimpl();
        Object[] objects= tourDao.findByProperty(property,sortExpression,sortDirecton,0,0);

    }
    @Test
    public void checkDeleteById(){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        RoleDao roleDao = new RoleDaoimpl();
        int count = roleDao.deleteById(list);
    }

}
