package com.wolfman.visitor.visitor;

/**
 * 访问者
 */
public abstract class Person {

    /**
     * 提供一个方法，让访问者可以访问
     *
     * @param action
     */
    public abstract void accept(Action action);
}
