package com.neusoft;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author Liu
 * @date 2020/5/31 18:15
 */

// 普通成员类
public class Member extends User {

    public Member() {
    }

    public Member(String name, int money) {
        super(name, money);
    }

    public void receive(ArrayList<Integer> list){
        //从多个红包中随机收取一个，给我自己
        //随机获取一个集合当中的索引编号
        int index = new Random().nextInt(list.size());
        //根据索引，从集合当中删除，并且得到被删除的红包，给我自己
        int dalta = list.remove(index);
        //当前成员自己本来有多少钱
        int money = super.getMoney();
        //加法，并且从新设置回去
        super.setMoney(money + dalta);
    }

}
