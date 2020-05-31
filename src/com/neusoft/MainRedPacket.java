package com.neusoft;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Liu
 * @date 2020/5/31 18:24
 */
public class MainRedPacket {
    public static void main(String[] args) {

            Manager manager = new Manager("群主",100);
            Member one = new Member("成员A",0);
            Member two = new Member("成员B",0);
            Member three = new Member("成员C",0);


            manager.show();
            one.show();
            two.show();
            three.show();

            System.out.println("=============================");

            //群主共发20元，分成3个红包
            ArrayList<Integer> redList = manager.sent(20,3);
            //3个普通成员收红包
            one.receive(redList);
            two.receive(redList);
            three.receive(redList);


            manager.show();
            one.show();
            two.show();
            three.show();

    }
}
