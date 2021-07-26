package com.wolfman.factory.factorymethod.order;


import com.wolfman.factory.factorymethod.pizza.BJCheesePizza;
import com.wolfman.factory.factorymethod.pizza.BJPepperPizza;
import com.wolfman.factory.factorymethod.pizza.Pizza;

public class BJOrderPizza extends OrderPizza {
    @Override
    Pizza createPizza(String orderType) {

        Pizza pizza = null;
        if (orderType.equals("cheese")) {
            pizza = new BJCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new BJPepperPizza();
        }
        return pizza;
    }
}
