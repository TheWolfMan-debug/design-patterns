package com.wolfman.singleton.type6;

/**
 * @Title
 * @Description
 * @Author WolfMan
 * @Date 2021/7/22 20:59
 * @Email 2370032534@qq.com
 */
public class SingletonTest06 {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1 == instance2);
        System.out.println("instance1.hashCode=" + instance1.hashCode());
        System.out.println("instance2.hashCode=" + instance2.hashCode());

    }
}

/**
 * 双重检查
 */
class Singleton {
    /**
     * 声明静态实例变量，使用volatile修饰，保证线程可见性
     */
    private static volatile Singleton instance;

    /**
     * 构造方法私有化，防止外部创建
     */
    private Singleton() {

    }

    /**
     * 提供一个静态的共有方法，加入双重检查，解决线程安全问题
     * 实现了懒加载（Lazy loading），同时提高了效率，推荐使用
     *
     * @return
     */
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
