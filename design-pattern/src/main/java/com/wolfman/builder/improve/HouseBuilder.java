package com.wolfman.builder.improve;


/**
 * 抽象的建造者
 */
public abstract class HouseBuilder {

    protected House house = new House();

    /**
     * 创建流程
     */
    public abstract void buildBasic();

    /**
     * 创建流程
     */
    public abstract void buildWalls();

    /**
     * 创建流程
     */
    public abstract void roofed();

    /**
     * 返回产品
     *
     * @return
     */
    public House buildHouse() {
        return house;
    }

}
