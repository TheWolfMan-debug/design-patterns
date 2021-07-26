package com.wolfman.adapter.classadapter;

/**
 * @Title
 * @Description 被适配的类
 * @Author WolfMan
 * @Date 2021/7/23 23:54
 * @Email 2370032534@qq.com
 */
public class Voltage220V {

    /**
     * 输出220V的电压
     *
     * @return
     */
    public int output220V() {
        int src = 220;
        System.out.println("电压=" + src + "伏");
        return src;
    }

}
