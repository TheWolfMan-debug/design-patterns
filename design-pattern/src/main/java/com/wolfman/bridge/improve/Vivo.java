package com.wolfman.bridge.improve;

/**
 * @Title
 * @Description
 * @Author WolfMan
 * @Date 2021/7/24 14:18
 * @Email 2370032534@qq.com
 */
public class Vivo implements Brand {
    @Override
    public void open() {
        System.out.println(" Vivo手机开机 ");
    }

    @Override
    public void close() {
        System.out.println(" Vivo手机关机 ");
    }

    @Override
    public void call() {
        System.out.println(" Vivo手机打电话 ");
    }
}
