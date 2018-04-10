package com.example.demo.userdefined;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableConfigurationProperties({UserDefined.class})
public class UserDefinedControl {

    @Autowired
    UserDefined userDefined;

    @RequestMapping ("/defined")
    public String defined(){
        return "来自自定义对象"+userDefined.getName();
    }
}