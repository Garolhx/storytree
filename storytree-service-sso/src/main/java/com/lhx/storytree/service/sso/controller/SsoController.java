package com.lhx.storytree.service.sso.controller;

import com.lhx.storytree.commons.domain.User;
import com.lhx.storytree.commons.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/sso")
@CrossOrigin(value = "http://localhost:8080", maxAge = 3600)
public class SsoController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping( value = "/login", method = RequestMethod.POST)
    public Map<String, Object> Login(@RequestBody User user){

        User user1 = userMapper.selectOne(user);

        HashMap<String, Object> map = new HashMap<>();

        if( user1 != null){
            map.put("code",0);
            map.put("msg","请求成功");
            map.put("user",user1);
            return map;
        }else {
            map.put("code",0);
            map.put("msg","请求失败");
            return map;
        }
    }
}
