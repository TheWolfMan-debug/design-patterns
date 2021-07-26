package com.wolfman.singleton.type8;

/**
 * 枚举
 */
enum Singleton {
    /**
     * 属性
     */
    INSTANCE;

    /**
     * 方法
     */
    public void method() {
        System.out.println("调用方法……");
    }
}

/**
 * @Title
 * @Description
 * @Author WolfMan
 * @Date 2021/7/22 21:19
 * @Email 2370032534@qq.com
 */
public class SingletonTest08 {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.INSTANCE;
        Singleton instance2 = Singleton.INSTANCE;
        System.out.println(instance1 == instance2);
        System.out.println("instance.hashCode=" + instance1.hashCode());
        System.out.println("instance2.hashCode=" + instance2.hashCode());
        instance1.method();
        instance2.method();
    }
}