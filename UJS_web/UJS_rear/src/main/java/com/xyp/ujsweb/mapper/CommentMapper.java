package com.xyp.ujsweb.mapper;

import com.xyp.ujsweb.entity.Comment;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

/**
 * CommentMapper:
 *
 * @author XvYanPeng
 * @date 2019/5/11 21:01
 */
@Component
@Mapper
public interface CommentMapper {
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
