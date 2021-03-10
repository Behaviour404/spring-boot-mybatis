package com.people.Controller;

import com.people.mapper.UserMapper;
import com.people.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class UserController {
    @Autowired
    private UserMapper userMapper;
    @GetMapping("/queryUserList")
    public List<User> queryUserList(){
        List<User> userList = userMapper.queryUserList();
        for(User user : userList){
            System.out.println(user);
        }
        return userList;
    }
    @GetMapping("/addUser")
    public String adduser(){
        userMapper.addUser(new User(2,"项羽","男","河北省石家庄市裕华区"));
        return "ok";
    }
    @GetMapping("/updateUser")
    public String updateUer(){
        userMapper.updateUser(new User(2,"赵云","男","河北省石家庄市裕华区"));
        return "ok";
    }
    @GetMapping("/delectUser")
    public String delectUser(){
        userMapper.deleteUser(2);
        return "ok";
    }
    @GetMapping("/queryUserById")
    public User queryUserById(){
        User userList = userMapper.queryUserById(2);
        System.out.println(userList);
        return userList;
    }
    @RequestMapping("/test")
    public String showInfo(Model model){
        model.addAttribute("msg","Thymeleaf入门案例...");
        return "index";
    }

}
