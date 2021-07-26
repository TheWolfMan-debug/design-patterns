package com.wolfman.adapter.classadapter;

/**
 * @Title
 * @Description
 * @Author WolfMan
 * @Date 2021/7/23 23:56
 * @Email 2370032534@qq.com
 */
public class Client {

    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.charging(new VoltageAdapter());
    }


}
