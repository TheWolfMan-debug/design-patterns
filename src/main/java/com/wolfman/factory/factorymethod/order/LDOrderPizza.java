package com.wolfman.factory.factorymethod.order;


import com.wolfman.factory.factorymethod.pizza.LDCheesePizza;
import com.wolfman.factory.factorymethod.pizza.LDPepperPizza;
import com.wolfman.factory.factorymethod.pizza.Pizza;

public class LDOrderPizza extends OrderPizza {
	@Override
	Pizza createPizza(String orderType) {

		Pizza pizza = null;
		if(orderType.equals("cheese")) {
			pizza = new LDCheesePizza();
		} else if (orderType.equals("pepper")) {
			pizza = new LDPepperPizza();
		}
		return pizza;
	}

}
