package com.xyp.ujsweb.mapper;

import com.xyp.ujsweb.entity.Friend;
import com.xyp.ujsweb.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

/**
 * FirendMapper:用于进行Firend相关的数据库操作
 *
 * @author XvYanPeng
 * @date 2019/5/1 19:03
 */
@Component
@Mapper
public interface FriendMapper {
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
