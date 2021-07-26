package com.wolfman.facade.facade;

/**
 * @Title
 * @Description
 * @Author WolfMan
 * @Date 2021/7/24 20:46
 * @Email 2370032534@qq.com
 */
public class Stereo {

    private static Stereo instance = new Stereo();

    public static Stereo getInstance() {
        return instance;
    }

    public void on() {
        System.out.println(" Stereo on ");
    }

    public void off() {
        System.out.println(" Screen off ");
    }

    public void up() {
        System.out.println(" Screen up.. ");
    }

}
