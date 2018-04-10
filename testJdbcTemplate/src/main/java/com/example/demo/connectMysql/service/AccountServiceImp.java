package com.example.demo.connectMysql.service;

import com.example.demo.connectMysql.Account;
import com.example.demo.connectMysql.dao.AccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class AccountServiceImp implements AccountService {

    @Autowired
    AccountDao accountDao;

    @Override
    public int add(Account account) {
       return accountDao.add(account);
    }

    @Override
    public int update(Account account) {
           return 0;
    }

    @Override
    public int delete(int id) {
        return 0;
    }

    @Override
    public Account findAccountById(int id) {
        Account account=new Account();
        return account;
    }

    @Override
    public List<Account> findAccountList() {
        return accountDao.findAccountList();
    }
}