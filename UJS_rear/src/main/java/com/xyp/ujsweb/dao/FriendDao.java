package com.xyp.ujsweb.dao;

import com.xyp.ujsweb.entity.Friend;
import com.xyp.ujsweb.entity.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

/**
 * FriendDao:
 *
 * @author XvYanPeng
 * @date 2019/5/2 12:06
 */

public interface FriendDao {
    /**
     * @description
     * 插入朋友item
     * @params [friend]
     * @return void
     * @date   2019/5/1
     */
    void insertFriend(Friend friend);
    /**
     * @description
     * 删除朋友item
     * @params [friend]
     * @return void
     * @date   2019/5/1
     */
    void deleteFriend(Friend friend);
    /**
     * @description
     * 根据用户名查询所有朋友
     * @params []
     * @return void
     * @date   2019/5/1
     */
    ArrayList<User> selectFriendsByUserName(String userName);
}
