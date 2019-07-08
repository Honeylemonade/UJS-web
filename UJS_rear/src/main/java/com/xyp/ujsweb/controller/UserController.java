package com.xyp.ujsweb.controller;

import com.xyp.ujsweb.entity.User;
import com.xyp.ujsweb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

/**
 * UserController:
 *
 * @author XvYanPeng
 * @date 2019/5/2 12:24
 */
@CrossOrigin
@RestController
public class UserController {
    @Autowired
    UserService userService;

    /**
     * @return com.xyp.ujsweb.entity.User
     * @description 根据用户名，获取该用户信息
     * @params [userName]
     * @date 2019/5/12
     */
    @GetMapping("/user/{userName}")
    public User selectUserByUserName(@PathVariable("userName") String userName) {
        return userService.selectUserByUserName(userName);
    }

    /**
     * @return com.xyp.ujsweb.entity.User
     * @description 根据邮箱获取用户
     * @params [email]
     * @date 2019/5/17
     */
    @GetMapping("/euser/{email}")
    public User selectUserByEmail(@PathVariable("email") String email) {
        return userService.selectUserByEmail(email);
    }

    /**
     * @return com.xyp.ujsweb.entity.User
     * @description 根据电话号码获取用户
     * @params [telephoneNumber]
     * @date 2019/5/17
     */
    @GetMapping("/tuser/{telephoneNumber}")
    public User selectUserByTelephoneNumber(@PathVariable("telephoneNumber") String telephoneNumber) {
        return userService.selectUserByTelephoneNumber(telephoneNumber);
    }

    /**
     * @return java.util.ArrayList<com.xyp.ujsweb.entity.User>
     * @description 获取全部用户信息
     * @params []
     * @date 2019/5/12
     */
    @GetMapping("/user")
    public ArrayList<User> selectAllUsers() {
        return userService.selectAllUsers();
    }

    /**
     * @return void
     * @description 根据用户名，删除某一用户
     * @params [userName]
     * @date 2019/5/12
     */
    @DeleteMapping("/user/{userName}")
    public void deleteUserByUserName(@PathVariable("userName") String userName) {
        userService.deleteUserByUserName(userName);
    }

    /**
     * @return void
     * @description 插入一条用户信息
     * @params [user]
     * @date 2019/5/12
     */
    @PostMapping("/user")
    public void insertUser(@RequestBody User user) {
        userService.insertUser(user);
    }

    /**
     * @return void
     * @description 修改某一用户信息
     * @params [user]
     * @date 2019/5/12
     */
    @PutMapping("/user")
    public void updateUserByUserName(@RequestBody User user) {
        userService.updateUserByUserName(user);
    }
}
