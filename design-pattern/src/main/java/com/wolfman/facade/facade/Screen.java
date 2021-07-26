package com.wolfman.facade.facade;

/**
 * @Title
 * @Description
 * @Author WolfMan
 * @Date 2021/7/24 20:45
 * @Email 2370032534@qq.com
 */
public class Screen {

    private static Screen instance = new Screen();

    public static Screen getInstance() {
        return instance;
    }

    public void up() {
        System.out.println(" Screen up ");
    }

    public void down() {
        System.out.println(" Screen down ");
    }

}
