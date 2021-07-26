package com.wolfman.decorator.improve.decorator;

import com.wolfman.decorator.improve.component.Drink;

/**
 * @Title
 * @Description
 * @Author WolfMan
 * @Date 2021/7/24 16:14
 * @Email 2370032534@qq.com
 */
public class Decorator extends Drink {

    /**
     * 聚合
     */
    private Drink obj;

    public Decorator(Drink obj) {
        this.obj = obj;
    }

    @Override
    public float cost() {
        return super.getPrice() + obj.cost();
    }

    @Override
    public String getDes() {
        // obj.getDes() 输出被装饰者的信息
        return des + " " + getPrice() + " && " + obj.getDes();
    }

}
