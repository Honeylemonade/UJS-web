package com.xyp.ujsweb.mapper;

import com.xyp.ujsweb.entity.ScoreItem;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

/**
 * ScoreItemMapper:
 *
 * @author XvYanPeng
 * @date 2019/5/2 11:18
 */
@Component
@Mapper
public interface ScoreItemMapper {
    /**
     * @return void
     * @description 插入游戏成绩记录
     * @params [scoreItem]
     * @date 2019/5/2
     */
    void insertScoreItem(ScoreItem scoreItem);

    /**
     * @return java.util.ArrayList<com.xyp.ujsweb.entity.ScoreItem>
     * @description 根据用户名查找出此用户的所有成绩记录
     * @params [userName]
     * @date 2019/5/2
     */
    ArrayList<ScoreItem> selectScoreItemByUserName(String userName);

    /**
     * @return java.util.ArrayList<com.xyp.ujsweb.entity.ScoreItem>
     * @description 根据用户名查找其好友排名
     * @params [userName]
     * @date 2019/5/13
     */
    ArrayList<ScoreItem> selectFriendRankByUserName(String userName);

}
