package com.wolfman.factory.traditional.order;


import com.wolfman.factory.traditional.pizza.CheesePizza;
import com.wolfman.factory.traditional.pizza.GreekPizza;
import com.wolfman.factory.traditional.pizza.PepperPizza;
import com.wolfman.factory.traditional.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 订购pizza
 */
public class OrderPizza {

    /**
     * 构造器
     */
    public OrderPizza() {
        Pizza pizza;
        String orderType; // 订购披萨的类型
        do {
            orderType = getType();
            if (orderType.equals("greek")) {
                pizza = new GreekPizza();
                pizza.setName("希腊披萨");
            } else if (orderType.equals("cheese")) {
                pizza = new CheesePizza();
                pizza.setName("奶酪披萨");
            } else if (orderType.equals("pepper")) {
                pizza = new PepperPizza();
                pizza.setName("胡椒披萨");
            } else {
                break;
            }
            //输出pizza 制作过程
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();

        } while (true);
    }

    /**
     * 接受输入
     *
     * @return
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
