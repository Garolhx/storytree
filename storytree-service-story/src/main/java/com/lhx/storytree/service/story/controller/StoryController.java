package com.lhx.storytree.service.story.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lhx.storytree.commons.domain.Chapter;
import com.lhx.storytree.commons.domain.Notice;
import com.lhx.storytree.commons.domain.PageUtils.PageUtils;
import com.lhx.storytree.commons.domain.Story;
import com.lhx.storytree.commons.domain.User;
import com.lhx.storytree.commons.mapper.ChapterMapper;
import com.lhx.storytree.commons.mapper.NoticeMapper;
import com.lhx.storytree.commons.mapper.StoryMapper;
import com.lhx.storytree.commons.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tk.mybatis.mapper.entity.Example;

import java.sql.Timestamp;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/story")
@CrossOrigin(value = "http://localhost:8080", maxAge = 3600)
public class StoryController {

    @Autowired
    StoryMapper storyMapper;
    @Autowired
    ChapterMapper chapterMapper;
    @Autowired
    UserMapper userMapper;
    @Autowired
    NoticeMapper noticeMapper;

    @RequestMapping(value = "/list", method = RequestMethod.POST)
    public Map<String, Object> StoryList(@RequestBody PageUtils pageUtils) {
        Page page = PageHelper.startPage(pageUtils.getPageNum(), pageUtils.getPageSize());
        PageHelper.orderBy("story_id ASC");
        if(pageUtils.getCriteria() == ""){
            List<Story> storyLists = storyMapper.selectAll();
            for (Story story : storyLists) {
                User user = userMapper.selectByPrimaryKey(story.getStoryAuthor());
                story.setStoryAuthor(user.getUserName());
            }
            Long total = page.getTotal();
            PageInfo<Story> pageInfo = new PageInfo<Story>(storyLists);
            HashMap<String, Object> map = new HashMap<>();
            System.out.println(storyLists);
            map.put("code", 0);
            map.put("msg", "请求成功");
            map.put("data", storyLists);
            map.put("count", total);
            return map;
        }
        else {
            Example example = new Example(Story.class);
            Example.Criteria criteria = example.createCriteria();
            String c = "%"+pageUtils.getCriteria()+"%";
            criteria.andLike("storyTitle", c)
                    .orLike("storyIntroduction", c);
            List<Story> storyLists = storyMapper.selectByExample(example);
            for (Story story : storyLists) {
                User user = userMapper.selectByPrimaryKey(story.getStoryAuthor());
                story.setStoryAuthor(user.getUserName());
            }
            Long total = page.getTotal();
            PageInfo<Story> pageInfo = new PageInfo<Story>(storyLists);
            HashMap<String, Object> map = new HashMap<>();
            System.out.println(storyLists);
            map.put("code", 0);
            map.put("msg", "请求成功");
            map.put("data", storyLists);
            map.put("count", total);
            return map;
        }

    }

    @RequestMapping(value = "/listByUserId", method = RequestMethod.POST)
    public Map<String, Object> StoryListByUserId(@RequestBody PageUtils pageUtils) {
        Page page = PageHelper.startPage(pageUtils.getPageNum(), pageUtils.getPageSize());
        PageHelper.orderBy("story_id ASC");

        Example example = new Example(Story.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("storyAuthor", pageUtils.getStoryAuthor());

        List<Story> storyLists = storyMapper.selectByExample(example);
        for (Story story : storyLists) {
            User user = userMapper.selectByPrimaryKey(story.getStoryAuthor());
            story.setStoryAuthor(user.getUserName());
        }
        Long total = page.getTotal();
        PageInfo<Story> pageInfo = new PageInfo<Story>(storyLists);
        HashMap<String, Object> map = new HashMap<>();
        System.out.println(storyLists);
        map.put("code", 0);
        map.put("msg", "请求成功");
        map.put("story", storyLists);
        map.put("count", total);
        return map;
    }


    @RequestMapping(value = "/chapter", method = RequestMethod.POST)
    public Map<String, Object> Chapter(@RequestBody PageUtils pageUtils
    ) {
        Page page = PageHelper.startPage(pageUtils.getPageNum(), pageUtils.getPageSize());
        PageHelper.orderBy("chapter_id ASC");

        Example example = new Example(Chapter.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("chapterStoryId", pageUtils.getStoryId());

        List<Chapter> chapterLists = chapterMapper.selectByExample(example);
        for (Chapter chapter : chapterLists) {
            User user = userMapper.selectByPrimaryKey(chapter.getChapterAuthor());
            chapter.setChapterAuthor(user.getUserName());
        }

        Story story = storyMapper.selectByPrimaryKey(pageUtils.getStoryId());
        User user = userMapper.selectByPrimaryKey(story.getStoryAuthor());
        story.setStoryAuthor(user.getUserName());

        Long total = page.getTotal();
        PageInfo<Chapter> pageInfo = new PageInfo<Chapter>(chapterLists);

        HashMap<String, Object> map = new HashMap<>();
        System.out.println(chapterLists);
        System.out.println(story);
        map.put("code", 0);
        map.put("msg", "请求成功");
        map.put("chapter", chapterLists);
        map.put("article", story);
        map.put("count", total);
        return map;
    }

    @RequestMapping(value = "/notices", method = RequestMethod.POST)
    public Map<String, Object> NoticesList() {

        List<Notice> noticeLists = noticeMapper.selectAll();

        HashMap<String, Object> map = new HashMap<>();
        System.out.println(noticeLists);
        map.put("code", 0);
        map.put("msg", "请求成功");
        map.put("notice", noticeLists);
        return map;
    }
}



