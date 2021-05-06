package com.mono.core.test;

import com.mono.core.dao.UserDao;
import com.mono.core.daoimpl.UserDaoimpl;
import com.mono.core.dto.UserDTO;
import com.mono.core.persistence.entity.UserEntity;
import com.mono.core.service.UserService;
import com.mono.core.service.impl.UserServiceimpl;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class LoginTest {
    private final Logger log = Logger.getLogger(this.getClass());
    @Test
    public void checkIsUserExist() {
        String name = "tamtruong";
        String password = "123456";
        UserDao userDao = new UserDaoimpl();
        UserDTO userDTO = new UserDTO();
        userDTO.setName(name);
        userDTO.setPassword(password);
        UserEntity entity = userDao.findRoleByUser(name,password);
         UserService service = new UserServiceimpl();
        UserDTO userDTO2 = service.isUserExist(userDTO);
        if(userDTO2 != null){
            log.error(entity.getRoleEntity().getRoleId()+"-"+entity.getRoleEntity().getName());
        }else{
            log.error("fail");
        }
    }
}
