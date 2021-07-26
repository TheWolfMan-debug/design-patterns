package com.wolfman.builder.traditional;

/**
 * @Title
 * @Description
 * @Author WolfMan
 * @Date 2021/7/23 17:39
 * @Email 2370032534@qq.com
 */
public abstract class AbstractHouse {

    /**
     * 打地基
     */
    public abstract void buildBasic();

    /**
     * 砌墙
     */
    public abstract void buildWalls();

    /**
     * 封顶
     */
    public abstract void roofed();

    /**
     * 建造
     */
    public void build() {
        buildBasic();
        buildWalls();
        roofed();
    }

}
