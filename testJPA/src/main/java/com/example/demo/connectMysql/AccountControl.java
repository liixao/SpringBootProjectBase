package com.example.demo.connectMysql;

import com.example.demo.connectMysql.dao.AccountDao;
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
       AccountDao accountDao;

       @RequestMapping(value = "/list", method = RequestMethod.GET)
       public List<Account> getAccounts() {

              List<Account> list=new ArrayList<>();
              list=accountDao.findAll();
              for(Account a:list){
                     System.out.println(a.getName());
              }


              return accountDao.findAll();
       }


}