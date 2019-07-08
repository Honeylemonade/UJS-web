package com.xyp.ujsweb.controller;

import com.xyp.ujsweb.entity.Comment;
import com.xyp.ujsweb.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

/**
 * CommentController:
 *
 * @author XvYanPeng
 * @date 2019/5/11 21:50
 */
@CrossOrigin
@RestController
public class CommentController {
    @Autowired
    CommentService commentService;

    /**
     * @return java.util.ArrayList<com.xyp.ujsweb.entity.Comment>
     * @description 获取全部评论
     * @params []
     * @date 2019/5/12
     */
    @GetMapping("/comment")
    public ArrayList<Comment> selectAllComments() {
        return commentService.selectAllComments();
    }

    /**
     * @return void
     * @description 插入一条评论
     * @params [comment]
     * @date 2019/5/12
     */
    @PostMapping("/comment")
    public void insertComment(@RequestBody Comment comment) {
        commentService.insertComment(comment);
    }
}
