package com.neusoft;

/**
 * @author Liu
 * @date 2020/5/31 20:45
 */
public class AnimalLiveable implements Liveable {

    @Override
    public void eat() {
        System.out.println("卡卡早");
    }

    @Override
    public void sleep() {
        System.out.println("呼呼睡");
    }
}
