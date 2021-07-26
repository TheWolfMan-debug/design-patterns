package com.wolfman.factory.absfactory.order;


import com.wolfman.factory.absfactory.pizza.Pizza;

/**
 * 一个抽象工厂模式的抽象层(接口)
 *
 * @author WolfMan
 */
public interface AbsFactory {
    /**
     * 让下面的工厂子类来 具体实现
     *
     * @param orderType
     * @return
     */
    Pizza createPizza(String orderType);
}
