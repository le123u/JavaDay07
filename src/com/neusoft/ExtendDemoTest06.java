package com.neusoft;

/**
 * @author Liu
 * @date 2020/5/31 14:30
 */
public class ExtendDemoTest06 {
    public static void main(String[] args) {

        NewPhone newPhone = new NewPhone();
        //调用父类的成员方法
        newPhone.sendMessage();
        newPhone.call();
        //调用子类重写的方法
        newPhone.showNum();


    }
}
