package com.wolfman.adapter.interfaceadapter;

/**
 * @Title
 * @Description
 * @Author WolfMan
 * @Date 2021/7/24 0:41
 * @Email 2370032534@qq.com
 */
public class Client {

    public static void main(String[] args) {
        AbsAdapter absAdapter = new AbsAdapter() {
            //只需要去覆盖我们 需要使用 接口方法
            @Override
            public void m1() {
                System.out.println("使用了m1的方法");
            }
        };
        absAdapter.m1();
    }

}
