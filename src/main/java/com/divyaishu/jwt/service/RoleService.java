package com.divyaishu.jwt.service;

import com.divyaishu.jwt.dao.RoleDao;
import com.divyaishu.jwt.entity.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService {

    @Autowired
    private RoleDao roleDao;
    //Here we need to autowire the dao so that we can use it here


    public Role createNewRole(Role role){
        return roleDao.save(role);
        //Here we will use the dao, the above line will store the information in the DB and will return the saved information.
    }

}
