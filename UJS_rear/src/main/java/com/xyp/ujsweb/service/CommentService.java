package com.xyp.ujsweb.service;

import com.xyp.ujsweb.entity.Comment;

import java.util.ArrayList;

/**
 * CommentService:
 *
 * @author XvYanPeng
 * @date 2019/5/11 21:38
 */
public interface CommentService {
    /**
     * @description
     * 获取全部评论信息
     * @params []
     * @return java.util.ArrayList<com.xyp.ujsweb.entity.Comment>
     * @date   2019/5/11
     */
    ArrayList<Comment> selectAllComments();
    /**
     * @description
     * 插入评论
     * @params [comment]
     * @return void
     * @date   2019/5/11
     */
    void insertComment(Comment comment);
}
