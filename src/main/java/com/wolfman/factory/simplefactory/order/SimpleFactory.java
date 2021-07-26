package com.wolfman.factory.simplefactory.order;


import com.wolfman.factory.simplefactory.pizza.CheesePizza;
import com.wolfman.factory.simplefactory.pizza.GreekPizza;
import com.wolfman.factory.simplefactory.pizza.PepperPizza;
import com.wolfman.factory.simplefactory.pizza.Pizza;

/**
 * 简单工厂模式
 */
public class SimpleFactory {

    /**
     * 静态工厂模式
     *
     * @param orderType
     * @return
     */
    public static Pizza createPizza2(String orderType) {
        Pizza pizza = null;
        System.out.println("使用简单工厂模式2");
        if (orderType.equals("greek")) {
            pizza = new GreekPizza();
            pizza.setName(" 希腊披萨 ");
        } else if (orderType.equals("cheese")) {
            pizza = new CheesePizza();
            pizza.setName(" 奶酪披萨 ");
        } else if (orderType.equals("pepper")) {
            pizza = new PepperPizza();
            pizza.setName("胡椒披萨");
        }
        return pizza;
    }

    /**
     * 需要实例化类
     *
     * @param orderType
     * @return
     */
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        System.out.println("使用简单工厂模式");
        if (orderType.equals("greek")) {
            pizza = new GreekPizza();
            pizza.setName(" 希腊披萨 ");
        } else if (orderType.equals("cheese")) {
            pizza = new CheesePizza();
            pizza.setName(" 奶酪披萨 ");
        } else if (orderType.equals("pepper")) {
            pizza = new PepperPizza();
            pizza.setName("胡椒披萨");
        }

        return pizza;
    }

}
