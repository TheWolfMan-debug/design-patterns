package com.wolfman.singleton.type2;


/**
 * @Title
 * @Description
 * @Author WolfMan
 * @Date 2021/7/22 20:32
 * @Email 2370032534@qq.com
 */
public class SingletonTest02 {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1 == instance2);
        System.out.println("instance1.hashCode=" + instance1.hashCode());
        System.out.println("instance2.hashCode=" + instance2.hashCode());
    }
}

/**
 * 饿汉式（静态代码块)
 */
class Singleton {
    /**
     * 声明静态实例变量
     */
    private static Singleton instance;

    /**
     * 在静态代码块中创建实例
     */
    static {
        instance = new Singleton();
    }

    /**
     * 构造器私有化，防止外部创建
     */
    private Singleton() {

    }

    /**
     * 提供一个公共的静态方法，返回实例对象
     *
     * @return
     */
    public static Singleton getInstance() {
        return instance;
    }
}