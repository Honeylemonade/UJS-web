package com.xyp.ujsweb.controller;

import com.xyp.ujsweb.entity.Friend;
import com.xyp.ujsweb.entity.ScoreItem;
import com.xyp.ujsweb.entity.User;
import com.xyp.ujsweb.mapper.FriendMapper;
import com.xyp.ujsweb.service.FriendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

/**
 * FriendController:
 * Rest风格的API接口
 *
 * @author XvYanPeng
 * @date 2019/5/1 22:18
 */
@CrossOrigin
@RestController
public class FriendController {
    @Autowired
    FriendService friendService;

    /**
     * @return java.util.ArrayList<com.xyp.ujsweb.entity.User>
     * @description 根据用户名，查询此用户的全部好友
     * @params [userName]
     * @date 2019/5/12
     */
    @GetMapping("/friend/{userName}")
    public ArrayList<User> selectFriendByUserName(@PathVariable("userName") String userName) {
        return friendService.selectFriendsByUserName(userName);
    }

    /**
     * @return com.xyp.ujsweb.entity.Friend
     * @description 插入两条好友（相对的）信息
     * @params [friend]
     * @date 2019/5/12
     */
    @PostMapping("/friend")
    public Friend insertFriend(@RequestBody Friend friend) {
        friendService.insertFriend(friend);
        return friend;
    }

    /**
     * @return void
     * @description 删除两条好友（相对的）信息
     * @params [friend]
     * @date 2019/5/12
     */
    @DeleteMapping("/friend")
    public void deleteFriendByUserName(@RequestBody Friend friend) {
        friendService.deleteFriend(friend);
    }

}
