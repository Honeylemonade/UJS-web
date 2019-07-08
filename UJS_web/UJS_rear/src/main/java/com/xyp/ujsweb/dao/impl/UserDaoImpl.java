package com.xyp.ujsweb.dao.impl;

import com.xyp.ujsweb.dao.UserDao;
import com.xyp.ujsweb.entity.User;
import com.xyp.ujsweb.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

/**
 * UserMapper:
 *
 * @author XvYanPeng
 * @date 2019/5/2 12:16
 */
@Repository
public class UserDaoImpl implements UserDao {
    @Autowired
    UserMapper userMapper;

    @Override
    public User selectUserByUserName(String userName) {
        return userMapper.selectUserByUserName(userName);
    }

    @Override
    public User selectUserByEmail(String email) {
        return userMapper.selectUserByEmail(email);
    }

    @Override
    public User selectUserByTelephoneNumber(String TelephoneNumber) {
        return userMapper.selectUserByTelephoneNumber(TelephoneNumber);
    }

    @Override
    public ArrayList<User> selectAllUsers() {
        return userMapper.selectAllUsers();
    }

    @Override
    public void deleteUserByUserName(String userName) {
        userMapper.deleteUserByUserName(userName);
    }

    @Override
    public void insertUser(User user) {
        userMapper.insertUser(user);
    }

    @Override
    public void updateUserByUserName(User user) {
        userMapper.updateUserByUserName(user);
    }
}
