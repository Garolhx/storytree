package com.lhx.storytree.service.reply.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lhx.storytree.commons.domain.Chapter;
import com.lhx.storytree.commons.domain.Comment;
import com.lhx.storytree.commons.domain.PageUtils.PageUtils;
import com.lhx.storytree.commons.domain.Story;
import com.lhx.storytree.commons.domain.User;
import com.lhx.storytree.commons.mapper.CommentMapper;
import com.lhx.storytree.commons.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tk.mybatis.mapper.entity.Example;

import java.sql.Timestamp;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/comment")
@CrossOrigin(value = "http://localhost:8080", maxAge = 3600)
public class ReplyController {

    @Autowired
    CommentMapper commentMapper;

    @Autowired
    UserMapper userMapper;

    @RequestMapping( value = "/list", method = RequestMethod.POST)
    public Map<String, Object> CommentList(@RequestBody PageUtils pageUtils){

        Example example=new Example(Comment.class);
        Example.Criteria criteria=example.createCriteria();
        criteria.andEqualTo("commentStoryId", pageUtils.getStoryId());

        List<Comment> commentLists = commentMapper.selectByExample(example);

        for(Comment comment : commentLists){
            User user = userMapper.selectByPrimaryKey(comment.getCommentAuthor());
            comment.setCommentAuthor(user.getUserName());
        }

        HashMap<String, Object> map = new HashMap<>();
        System.out.println(commentLists);
        map.put("code",0);
        map.put("msg","请求成功");
        map.put("comments",commentLists);
        return map;
    }

    @RequestMapping( value = "/add", method = RequestMethod.POST)
    public Map<String, Object> CommentAdd(@RequestBody Comment comment){

        int c = commentMapper.insertSelective(comment);

        HashMap<String, Object> map = new HashMap<>();
        System.out.println(comment);
        if (c == 0) {
            map.put("code", 0);
            map.put("msg", "添加失败");
        } else {
            map.put("code", 0);
            map.put("msg", "添加成功");
        }
        return map;
    }
}
