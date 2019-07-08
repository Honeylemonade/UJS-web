package com.xyp.ujsweb.service.impl;

import com.xyp.ujsweb.dao.ScoreItemDao;
import com.xyp.ujsweb.entity.ScoreItem;
import com.xyp.ujsweb.service.ScoreItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * ScoreItemServiceImpl:
 *
 * @author XvYanPeng
 * @date 2019/5/2 12:30
 */
@Service
public class ScoreItemServiceImpl implements ScoreItemService {
    @Autowired
    ScoreItemDao scoreItemDao;

    @Override
    public void insertScoreItem(ScoreItem scoreItem) {
        scoreItemDao.insertScoreItem(scoreItem);
    }

    @Override
    public ArrayList<ScoreItem> selectScoreItemByUserName(String userName) {

        return scoreItemDao.selectScoreItemByUserName(userName);
    }

    @Override
    public ArrayList<ScoreItem> selectFriendRankByUserName(String userName) {
        return scoreItemDao.selectFriendRankByUserName(userName);
    }
}
