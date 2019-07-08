package com.xyp.ujsweb.dao.impl;

import com.xyp.ujsweb.dao.ScoreItemDao;
import com.xyp.ujsweb.entity.ScoreItem;
import com.xyp.ujsweb.mapper.ScoreItemMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

/**
 * ScoreItemDaoImpl:
 *
 * @author XvYanPeng
 * @date 2019/5/2 12:14
 */
@Repository
public class ScoreItemDaoImpl implements ScoreItemDao {

    @Autowired
    ScoreItemMapper scoreItemMapper;

    @Override
    public void insertScoreItem(ScoreItem scoreItem) {
        scoreItemMapper.insertScoreItem(scoreItem);
    }

    @Override
    public ArrayList<ScoreItem> selectScoreItemByUserName(String userName) {
        return scoreItemMapper.selectScoreItemByUserName(userName);
    }

    @Override
    public ArrayList<ScoreItem> selectFriendRankByUserName(String userName) {
        return scoreItemMapper.selectFriendRankByUserName(userName);
    }

}
