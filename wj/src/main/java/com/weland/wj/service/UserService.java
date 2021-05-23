package com.weland.wj.service;

import com.weland.wj.dao.UserDAO;
import com.weland.wj.pojo.User;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class UserService {
    @Autowired
    UserDAO userDAO;

    public boolean isExist(String username){
        User user = getByName(username);
        return null!=user;
    }

    public User getByName(String username){
        return userDAO.findByUsername(username);
    }

    public User get(String username,String password){
        return userDAO.getByUsernameAndPassword(username, password);
    }

    public void add(User user){
        userDAO.save(user);
    }
}
