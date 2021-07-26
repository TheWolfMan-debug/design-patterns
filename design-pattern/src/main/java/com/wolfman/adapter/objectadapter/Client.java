package com.wolfman.adapter.objectadapter;

/**
 * @Title
 * @Description
 * @Author WolfMan
 * @Date 2021/7/24 0:22
 * @Email 2370032534@qq.com
 */
public class Client {
    public static void main(String[] args) {
        System.out.println(" === 对象适配器模式 ====");
        Phone phone = new Phone();
        phone.charging(new VoltageAdapter(new Voltage220V()));
    }
}
