package com.wolfman.factory.factorymethod.order;

import com.wolfman.factory.factorymethod.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public abstract class OrderPizza {
    public OrderPizza() {
        Pizza pizza = null;
        // 订购披萨的类型
        String orderType;
        do {
            orderType = getType();
            //抽象方法，由工厂子类完成
            pizza = createPizza(orderType);
            //输出pizza 制作过程
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();

        } while (true);
    }

    /**
     * 定义一个抽象方法，createPizza , 让各个工厂子类自己实现
     */
    abstract Pizza createPizza(String orderType);

    /**
     * 写一个方法，可以获取客户希望订购的披萨种类
     */
    private String getType() {
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza 种类:");
            String str = in.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }

}
