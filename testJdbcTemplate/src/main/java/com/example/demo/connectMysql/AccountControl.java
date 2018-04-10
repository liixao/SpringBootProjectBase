package com.example.demo.connectMysql;

import com.example.demo.connectMysql.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/account")
public class AccountControl {

    @Autowired
    AccountService accountService;

    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public  List<Account> getAccounts(){
         List<Account> list=new ArrayList<>();
        list=accountService.findAccountList();
        for(Account a:list){
            System.out.println(a.getName());
        }
        return list;
    }


}