package com.example.demo.user;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableConfigurationProperties({User.class})
public class UserControl {

    @Autowired
    public User user;

    @RequestMapping("/user")
    public String readUserName(){
        return "来自对象 "+user.getName();
    }
}