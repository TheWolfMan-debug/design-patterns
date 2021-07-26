package com.wolfman.decorator.improve.decorator;

import com.wolfman.decorator.improve.component.Drink;

/**
 * @Title
 * @Description
 * @Author WolfMan
 * @Date 2021/7/24 16:19
 * @Email 2370032534@qq.com
 */
public class Milk extends Decorator {
    public Milk(Drink obj) {
        super(obj);
        setDes(" 牛奶 ");
        setPrice(2.0f);
    }
}
