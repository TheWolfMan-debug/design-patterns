package com.wolfman.bridge.improve;

/**
 * @Title
 * @Description
 * @Author WolfMan
 * @Date 2021/7/24 14:17
 * @Email 2370032534@qq.com
 */
public class FoldedPhone extends Phone {

    public FoldedPhone(Brand brand) {
        super(brand);
    }

    @Override
    public void open() {
        super.open();
        System.out.println(" 折叠样式手机 ");
    }

    @Override
    public void close() {
        super.close();
        System.out.println(" 折叠样式手机 ");
    }

    @Override
    public void call() {
        super.call();
        System.out.println(" 折叠样式手机 ");
    }

}
