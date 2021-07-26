package com.wolfman.decorator.improve.decorator;

import com.wolfman.decorator.improve.component.Drink;

/**
 * @Title
 * @Description
 * @Author WolfMan
 * @Date 2021/7/24 16:18
 * @Email 2370032534@qq.com
 */
public class Chocolate extends Decorator {

    public Chocolate(Drink obj) {
        super(obj);
        setDes(" 巧克力 ");
        setPrice(3.0f);
    }

}
