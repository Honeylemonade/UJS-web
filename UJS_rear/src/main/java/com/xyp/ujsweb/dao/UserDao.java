package com.xyp.ujsweb.dao;

import com.xyp.ujsweb.entity.User;

import java.util.ArrayList;

/**
 * UserDao:
 *
 * @author XvYanPeng
 * @date 2019/5/2 12:15
 */
public interface UserDao {
    /**
     * @return com.xyp.ujsweb.entity.User
     * @description 根据用户名查询用户
     * @params [userName]
     * @date 2019/5/1
     */
    User selectUserByUserName(String userName);

    /**
     * @return com.xyp.ujsweb.entity.User
     * @description 根据用户邮箱查找用户
     * @params [email]
     * @date 2019/5/17
     */
    User selectUserByEmail(String email);

    /**
     * @return com.xyp.ujsweb.entity.User
     * @description 根据电话号码查询用户
     * @params [TelephoneNumber]
     * @date 2019/5/17
     */
    User selectUserByTelephoneNumber(String TelephoneNumber);

    /**
     * @return java.util.ArrayList<com.xyp.ujsweb.entity.User>
     * @description 查找出所有user
     * @params []
     * @date 2019/5/1
     */
    ArrayList<User> selectAllUsers();

    /**
     * @return void
     * @description 根据用户名，删除用户
     * @params [userName]
     * @date 2019/5/1
     */

    void deleteUserByUserName(String userName);

    /**
     * @return void
     * @description 插入用户
     * @params [user]
     * @date 2019/5/1
     */
    void insertUser(User user);

    /**
     * @return void
     * @description 根据用用户名，指定用户，并更新用户信息
     * @params [user]
     * @date 2019/5/1
     */
    void updateUserByUserName(User user);
}
