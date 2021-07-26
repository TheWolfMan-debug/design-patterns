package com.wolfman.singleton.type1;

/**
 * @Title
 * @Description
 * @Author WolfMan
 * @Date 2021/7/22 20:22
 * @Email 2370032534@qq.com
 */
public class SingletonTest01 {

    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1 == instance2);
        System.out.println("instance1.hashCode=" + instance1.hashCode());
        System.out.println("instance2.hashCode=" + instance2.hashCode());
    }

}

/**
 * 饿汉式（静态常量）
 */
class Singleton {
    /**
     * 在类加载时创建对象实例
     */
    private final static Singleton instance = new Singleton();

    /**
     * 构造器私有化，防止外部直接创建
     */
    private Singleton() {

    }

    /**
     * 提供共有的静态方法，返回对象实例
     *
     * @return
     */
    public static Singleton getInstance() {
        return instance;
    }
}
