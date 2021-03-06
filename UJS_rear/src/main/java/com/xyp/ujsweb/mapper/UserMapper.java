package com.xyp.ujsweb.mapper;

import com.xyp.ujsweb.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
/**
 * UserMapper:用于进行User相关的数据库操作
 *
 * @author XvYanPeng
 * @date 2019/5/1 19:03
 */

@Component
@Mapper
public interface UserMapper {
    /**
     * @return com.xyp.ujsweb.entity.User
     * @description 根据用户名查询用户
     * @params [userName]
     * @date 2019/5/1
     */
    User selectUserByUserName(String userName);
    /**
     * @description
     * 根据用户邮箱查询用户
     * @params [email]
     * @return com.xyp.ujsweb.entity.User
     * @date   2019/5/17
     */
    User selectUserByEmail(String email);
    /**
     * @description
     * 根据用户手机号查询用户
     * @params [telephoneNumber]
     * @return com.xyp.ujsweb.entity.User
     * @date   2019/5/17
     */
    User selectUserByTelephoneNumber(String telephoneNumber);

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
