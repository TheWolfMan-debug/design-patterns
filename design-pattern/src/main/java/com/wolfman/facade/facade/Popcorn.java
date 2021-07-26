package com.wolfman.facade.facade;

/**
 * @Title
 * @Description
 * @Author WolfMan
 * @Date 2021/7/24 20:45
 * @Email 2370032534@qq.com
 */
public class Popcorn {

    private static Popcorn instance = new Popcorn();

    public static Popcorn getInstance() {
        return instance;
    }

    public void on() {
        System.out.println(" popcorn on ");
    }

    public void off() {
        System.out.println(" popcorn ff ");
    }

    public void pop() {
        System.out.println(" popcorn is poping  ");
    }

}
