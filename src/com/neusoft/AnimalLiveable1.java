package com.neusoft;

/**
 * @author Liu
 * @date 2020/5/31 20:45
 */
public class AnimalLiveable1 implements Liveable1 {

   // 继承什么都可以不用写 直接调用即可

    // 重写

    @Override
    public void fly() {
        System.out.println("骄傲的在飞飞飞");
    }
}
