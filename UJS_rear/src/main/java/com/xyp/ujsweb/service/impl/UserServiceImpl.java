package com.xyp.ujsweb.service.impl;

import com.xyp.ujsweb.dao.UserDao;
import com.xyp.ujsweb.entity.User;
import com.xyp.ujsweb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * UserServiceImpl:
 *
 * @author XvYanPeng
 * @date 2019/5/2 12:30
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;

    @Override
    public User selectUserByUserName(String userName) {
        return userDao.selectUserByUserName(userName);
    }

    @Override
    public User selectUserByEmail(String email) {
        return userDao.selectUserByEmail(email);
    }

    @Override
    public User selectUserByTelephoneNumber(String TelephoneNumber) {
        return userDao.selectUserByTelephoneNumber(TelephoneNumber);
    }

    @Override
    public ArrayList<User> selectAllUsers() {
        return userDao.selectAllUsers();
    }

    @Override
    public void deleteUserByUserName(String userName) {
        userDao.deleteUserByUserName(userName);
    }

    @Override
    public void insertUser(User user) {
        userDao.insertUser(user);
    }

    @Override
    public void updateUserByUserName(User user) {
        userDao.updateUserByUserName(user);
    }
}
