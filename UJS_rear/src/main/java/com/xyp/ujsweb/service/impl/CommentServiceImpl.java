package com.xyp.ujsweb.service.impl;

import com.xyp.ujsweb.dao.CommentDao;
import com.xyp.ujsweb.entity.Comment;
import com.xyp.ujsweb.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * CommentServiceImpl:
 *
 * @author XvYanPeng
 * @date 2019/5/11 21:39
 */
@Service
public class CommentServiceImpl implements CommentService {
    @Autowired
    CommentDao commentDao;

    @Override
    public ArrayList<Comment> selectAllComments() {
        return commentDao.selectAllComments();
    }

    @Override
    public void insertComment(Comment comment) {
        commentDao.insertComment(comment);
    }
}
