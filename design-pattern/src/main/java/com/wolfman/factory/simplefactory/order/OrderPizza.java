package com.wolfman.factory.simplefactory.order;

import com.wolfman.factory.simplefactory.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class OrderPizza {

    /**
     * 定义一个简单工厂对象
     */
    SimpleFactory simpleFactory;
    /**
     * pizza
     */
    Pizza pizza = null;

    /**
     * 构造器
     *
     * @param simpleFactory
     */
    public OrderPizza(SimpleFactory simpleFactory) {
        setFactory(simpleFactory);
    }

    /**
     * 设置工厂类
     * @param simpleFactory
     */
    public void setFactory(SimpleFactory simpleFactory) {
        String orderType;
        //设置简单工厂对象
        this.simpleFactory = simpleFactory;
        do {
            orderType = getType();
            pizza = this.simpleFactory.createPizza(orderType);
            //输出pizza
            if (pizza != null) {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
                System.out.println(" 订购披萨失败 ");
                break;
            }
        } while (true);
    }

    /**
     * 写一个方法，可以获取客户希望订购的披萨种类
     *
     * @return
     */
    private String getType() {
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza 种类:");
            String str = strin.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }

}
