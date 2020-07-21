package com.lhx.storytree.service.user.controller;


import com.lhx.storytree.commons.domain.User;
import com.lhx.storytree.commons.mapper.UserMapper;
import com.lhx.storytree.service.user.ImgUploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/user")
@CrossOrigin(value = "http://localhost:8080", maxAge = 3600)
public class UserController {
    @Autowired
    UserMapper userMapper;
    @Autowired
    ImgUploadService imgUploadService;

    @RequestMapping( value = "/profile", method = RequestMethod.POST)
    public Map<String, Object> UserProfile(@RequestBody User user) {

        User user1 = userMapper.selectOne(user);

        HashMap<String, Object> map = new HashMap<>();

        if (user1 != null) {
            map.put("code", 0);
            map.put("msg", "请求成功");
            map.put("user", user1);
            return map;
        } else {
            map.put("code", 0);
            map.put("msg", "请求失败");
            return map;
        }
    }

    @RequestMapping( value = "/update", method = RequestMethod.POST)
    public Map<String, Object> UserUpdate(@RequestBody User user) {

        int i = userMapper.updateByPrimaryKeySelective(user);

        HashMap<String, Object> map = new HashMap<>();

        if (i != 0) {
            map.put("code", 0);
            map.put("msg", "修改成功");
            return map;
        } else {
            map.put("code", 0);
            map.put("msg", "修改失败");
            return map;
        }
    }

    @RequestMapping( value = "/img", method = RequestMethod.POST)
    public Map<String, Object> UserImg(@RequestParam("userImage")MultipartFile filePath) {

        Map<String, Object> map = imgUploadService.imgUpload(filePath, "/userImage");

        return map;
    }

}
