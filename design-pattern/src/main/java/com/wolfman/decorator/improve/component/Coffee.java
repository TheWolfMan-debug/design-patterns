package com.wolfman.decorator.improve.component;

/**
 * @Title
 * @Description 缓冲层
 * @Author WolfMan
 * @Date 2021/7/24 16:16
 * @Email 2370032534@qq.com
 */
public class Coffee extends Drink {

    @Override
    public float cost() {
        return super.getPrice();
    }

}
