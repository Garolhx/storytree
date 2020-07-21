package com.lhx.storytree.service.write.controller;

import com.lhx.storytree.commons.domain.Chapter;
import com.lhx.storytree.commons.domain.Comment;
import com.lhx.storytree.commons.domain.Story;
import com.lhx.storytree.commons.mapper.ChapterMapper;
import com.lhx.storytree.commons.mapper.StoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/write")
@CrossOrigin(value = "http://localhost:8080", maxAge = 3600)
public class WriteController {
    @Autowired
    StoryMapper storyMapper;
    @Autowired
    ChapterMapper chapterMapper;

    @RequestMapping( value = "/story", method = RequestMethod.POST)
    public Map<String, Object> StoryAdd(@RequestBody Story story){

        int s = storyMapper.insertSelective(story);

        HashMap<String, Object> map = new HashMap<>();
        System.out.println(story);
        if (s == 0) {
            map.put("code", 0);
            map.put("msg", "添加失败");
        } else {
            map.put("code", 0);
            map.put("msg", "添加成功");
        }
        return map;
    }

    @RequestMapping(value = "/chapter", method = RequestMethod.POST)
    public Map<String, Object> ChapterAdd(@RequestBody Chapter chapter
    ) {
        int i = chapterMapper.insertSelective(chapter);

        HashMap<String, Object> map = new HashMap<>();
        System.out.println(chapter);
        if (i == 0) {
            map.put("code", 0);
            map.put("msg", "添加失败");
        } else {
            map.put("code", 0);
            map.put("msg", "添加成功");
        }
        return map;
    }
}
