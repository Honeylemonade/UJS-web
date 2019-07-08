package com.xyp.ujsweb.controller;

import com.xyp.ujsweb.entity.Friend;
import com.xyp.ujsweb.entity.ScoreItem;
import com.xyp.ujsweb.service.ScoreItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

/**
 * ScoreItemController:
 *
 * @author XvYanPeng
 * @date 2019/5/2 12:23
 */
@CrossOrigin
@RestController
public class ScoreItemController {
    @Autowired
    ScoreItemService scoreItemService;

    /**
     * @return com.xyp.ujsweb.entity.ScoreItem
     * @description 插入一条游戏记录信息
     * @params [scoreItem]
     * @date 2019/5/12
     */
    @PostMapping("/scoreItem")
    public ScoreItem insertScoreItem(@RequestBody ScoreItem scoreItem) {
        scoreItemService.insertScoreItem(scoreItem);
        return scoreItem;
    }

    /**
     * @return java.util.ArrayList<com.xyp.ujsweb.entity.ScoreItem>
     * @description 根据用户名，获得该用户的全部游戏记录
     * @params [userName]
     * @date 2019/5/12
     */
    @GetMapping("/scoreItem/{userName}")
    public ArrayList<ScoreItem> selectScoreItemByUserName(@PathVariable("userName") String userName) {
        return scoreItemService.selectScoreItemByUserName(userName);
    }

    /**
     * @return java.util.ArrayList<com.xyp.ujsweb.entity.ScoreItem>
     * @description 根据用户名查找好友排行
     * @params [userName]
     * @date 2019/5/13
     */
    @GetMapping("/firendRank/{userName}")
    public ArrayList<ScoreItem> selectFriendRankByUserName(@PathVariable("userName") String userName) {
        return scoreItemService.selectFriendRankByUserName(userName);
    }
}
