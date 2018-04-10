package com.example.demo.connectMysql.dao;


import com.example.demo.connectMysql.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountDao extends JpaRepository<Account,Integer> {


}