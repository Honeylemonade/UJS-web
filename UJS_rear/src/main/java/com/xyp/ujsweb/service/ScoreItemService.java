package com.xyp.ujsweb.service;

import com.xyp.ujsweb.entity.ScoreItem;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * ScoreItemService:
 *
 * @author XvYanPeng
 * @date 2019/5/2 12:28
 */
public interface ScoreItemService {
    /**
     * @description 插入游戏成绩记录
     *
     * @params [scoreItem]
     * @return void
     * @date   2019/5/2
     */
    void insertScoreItem(ScoreItem scoreItem);
    /**
     * @description 根据用户名查找出此用户的所有成绩记录
     *
     * @params [userName]
     * @return java.util.ArrayList<com.xyp.ujsweb.entity.ScoreItem>
     * @date   2019/5/2
     */
    ArrayList<ScoreItem> selectScoreItemByUserName(String userName);
    /**
     * @description
     * 根据用户名查找其好友排名
     * @params [userName]
     * @return java.util.ArrayList<com.xyp.ujsweb.entity.ScoreItem>
     * @date   2019/5/13
     */
    ArrayList<ScoreItem> selectFriendRankByUserName(String userName);
}
