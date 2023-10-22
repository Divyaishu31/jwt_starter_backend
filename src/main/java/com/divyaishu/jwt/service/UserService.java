package com.divyaishu.jwt.service;

import com.divyaishu.jwt.dao.UserDao;
import com.divyaishu.jwt.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public User registerNewUser(User user){
        return userDao.save(user);
    }
}
