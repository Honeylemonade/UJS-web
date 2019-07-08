package com.xyp.ujsweb.service.impl;

import com.xyp.ujsweb.dao.FriendDao;
import com.xyp.ujsweb.dao.UserDao;
import com.xyp.ujsweb.entity.Friend;
import com.xyp.ujsweb.entity.User;
import com.xyp.ujsweb.service.FriendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * FriendServiceImpl:
 *
 * @author XvYanPeng
 * @date 2019/5/2 12:29
 */
@Service
public class FriendServiceImpl implements FriendService {
    @Autowired
    FriendDao friendDao;

    @Override
    public void insertFriend(Friend friend) {
        friendDao.insertFriend(friend);
    }

    @Override
    public void deleteFriend(Friend friend) {
        friendDao.deleteFriend(friend);
    }

    @Override
    public ArrayList<User> selectFriendsByUserName(String userName) {

        return friendDao.selectFriendsByUserName(userName);
    }
}
