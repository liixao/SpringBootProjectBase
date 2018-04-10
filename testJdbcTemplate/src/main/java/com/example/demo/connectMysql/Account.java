package com.example.demo.connectMysql;

public class Account {

    private int id;
    private String name;
    private  double  money;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double  getMoney() {
        return money;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMoney(double  money) {
        this.money = money;

    }
}