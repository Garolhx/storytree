package com.lhx.storytree.service.reg.controller;

import com.lhx.storytree.commons.domain.User;
import com.lhx.storytree.commons.domain.UserRole;
import com.lhx.storytree.commons.mapper.UserMapper;
import com.lhx.storytree.commons.mapper.UserRoleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/reg")
@CrossOrigin(value = "http://localhost:8080", maxAge = 3600)
public class RegController {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private UserRoleMapper userRoleMapper;

    @RequestMapping( value = "/checkUserName", method = RequestMethod.POST)
    public String checkUserName(@RequestBody User user){
        if(userMapper.selectOne(user) == null){
            return "ok";
        };
        return "presence";
    }

    @RequestMapping( value = "/add", method = RequestMethod.POST)
    public String add(@RequestBody User user){
        int i = userMapper.insertSelective(user);
        User u = userMapper.selectOne(user);
        UserRole userRole = new UserRole();
        userRole.setUserId(u.getUserId());
        int i1 = userRoleMapper.insertSelective(userRole);
        if(i != 0 && i1 != 0){
            return "success";
        };
        return "error";
    }

}
