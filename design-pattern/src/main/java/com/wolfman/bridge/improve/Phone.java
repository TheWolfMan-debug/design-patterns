package com.wolfman.bridge.improve;

/**
 * @Title
 * @Description
 * @Author WolfMan
 * @Date 2021/7/24 14:16
 * @Email 2370032534@qq.com
 */
public class Phone {

    /**
     * 聚合品牌
     */
    private Brand brand;

    /**
     * 构造器
     *
     * @param brand
     */
    public Phone(Brand brand) {
        super();
        this.brand = brand;
    }

    protected void open() {
        this.brand.open();
    }

    protected void close() {
        brand.close();
    }

    protected void call() {
        brand.call();
    }

}
