package com.xyp.ujsweb.dao.impl;

import com.xyp.ujsweb.dao.FriendDao;
import com.xyp.ujsweb.entity.Friend;
import com.xyp.ujsweb.entity.User;
import com.xyp.ujsweb.mapper.FriendMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

/**
 * FriendDaoImpl:
 *
 * @author XvYanPeng
 * @date 2019/5/2 12:08
 */
@Repository
public class FriendDaoImpl implements FriendDao {
    @Autowired
    FriendMapper friendMapper;

    @Override
    public void insertFriend(Friend friend) {
        friendMapper.insertFriend(friend);
    }

    @Override
    public void deleteFriend(Friend friend) {
        friendMapper.deleteFriend(friend);
    }

    @Override
    public ArrayList<User> selectFriendsByUserName(String userName) {
        return friendMapper.selectFriendsByUserName(userName);
    }
}
