package com.xyp.ujsweb.dao.impl;

import com.xyp.ujsweb.dao.CommentDao;
import com.xyp.ujsweb.entity.Comment;
import com.xyp.ujsweb.mapper.CommentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

/**
 * CommentDaoImpl:
 *
 * @author XvYanPeng
 * @date 2019/5/11 21:36
 */
@Repository
public class CommentDaoImpl implements CommentDao {
    @Autowired
    CommentMapper commentMapper;

    @Override
    public ArrayList<Comment> selectAllComments() {
        return commentMapper.selectAllComments();
    }

    @Override
    public void insertComment(Comment comment) {
        commentMapper.insertComment(comment);
    }
}
