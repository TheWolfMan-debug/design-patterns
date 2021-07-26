package com.wolfman.singleton.type7;

/**
 * @Title
 * @Description
 * @Author WolfMan
 * @Date 2021/7/22 21:10
 * @Email 2370032534@qq.com
 */
public class SingletonTest07 {

    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance == instance2);
        System.out.println("instance.hashCode=" + instance.hashCode());
        System.out.println("instance2.hashCode=" + instance2.hashCode());
    }

}

/**
 * 静态内部类
 */
class Singleton {
    /**
     * 构造方法私有化，防止外部创建
     */
    private Singleton() {

    }

    /**
     * 提供静态的共有方法，直接返回SingletonInstance.INSTANCE
     *
     * @return
     */
    public static Singleton getInstance() {
        return SingletonInstance.INSTANCE;
    }

    /**
     * 编写静态内部类，该类中有一个静态属性 INSTANCE
     */
    private static class SingletonInstance {
        private static final Singleton INSTANCE = new Singleton();
    }
}