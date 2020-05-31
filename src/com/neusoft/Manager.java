package com.neusoft;

import java.util.ArrayList;

/**
 * @author Liu
 * @date 2020/5/31 18:10
 */

// 群主类
public class Manager extends User{

    public Manager(){
    }

    public Manager(String name, int money) {
        super(name, money);
    }

    public ArrayList<Integer> sent(int totalMoney, int count){
        //需要一个集合，用来存储若干个红包金额
        ArrayList<Integer> redList = new ArrayList<>();

        //首先看一下群主自己有多少钱
        int leftMoney = super.getMoney(); // 群主当前余额
        if (totalMoney > leftMoney) {
            System.out.println("余额不足");
            return redList; //返回空集合
        }

        //扣钱，其实就是重新设置余额
        super.setMoney(leftMoney - totalMoney);

        //发红包需要平均拆分成为count份
        int avg = totalMoney / count;
        int mod = totalMoney % count; //余额，也就是甩下的零头

        //除不开的零头，包在最后一个红包当中
        //下面把红包一个个放到集合当中
        for (int i = 0; i < count - 1; i++) {
            redList.add(avg);
        }

        //这是最后一个红包
        int last = avg + mod;
        redList.add(last);

        return redList;
    }


}
