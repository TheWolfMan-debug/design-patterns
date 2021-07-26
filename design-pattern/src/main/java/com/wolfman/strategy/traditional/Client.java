package com.wolfman.strategy.traditional;

import java.util.ArrayList;

public class Client {

    public static void main(String[] args) {
        ArrayList<Duck> duckArrayList = new ArrayList<>();
        Duck pekingDuck = new PekingDuck();
        Duck toyDuck = new ToyDuck();
        Duck wildDuck = new WildDuck();
        duckArrayList.add(pekingDuck);
        duckArrayList.add(toyDuck);
        duckArrayList.add(wildDuck);
        duckArrayList.forEach((duck) -> {
            duck.fly();
            duck.display();
            duck.quack();
            duck.swim();
        });
    }

}
