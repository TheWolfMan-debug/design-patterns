package com.wolfman.factory.absfactory.order;


import com.wolfman.factory.absfactory.pizza.BJCheesePizza;
import com.wolfman.factory.absfactory.pizza.BJPepperPizza;
import com.wolfman.factory.absfactory.pizza.Pizza;

/**
 * 工厂子类
 */
public class BJFactory implements AbsFactory {

    @Override
    public Pizza createPizza(String orderType) {
        System.out.println("~使用的是抽象工厂模式~");
        Pizza pizza = null;
        if (orderType.equals("cheese")) {
            pizza = new BJCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new BJPepperPizza();
        }
        return pizza;
    }

}
