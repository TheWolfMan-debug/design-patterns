package com.wolfman.factory.simplefactory.pizza;

public class CheesePizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("给制作奶酪披萨准备原材料");
    }

}
