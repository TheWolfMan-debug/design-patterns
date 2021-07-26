package com.wolfman.facade.facade;

/**
 * @Title
 * @Description
 * @Author WolfMan
 * @Date 2021/7/24 20:46
 * @Email 2370032534@qq.com
 */
public class TheaterLight {

    private static TheaterLight instance = new TheaterLight();

    public static TheaterLight getInstance() {
        return instance;
    }

    public void on() {
        System.out.println(" TheaterLight on ");
    }

    public void off() {
        System.out.println(" TheaterLight off ");
    }

    public void dim() {
        System.out.println(" TheaterLight dim.. ");
    }

    public void bright() {
        System.out.println(" TheaterLight bright.. ");
    }

}
