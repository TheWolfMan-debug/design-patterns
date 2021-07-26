package com.wolfman.singleton.type3;

/**
 * @Title
 * @Description
 * @Author WolfMan
 * @Date 2021/7/22 20:42
 * @Email 2370032534@qq.com
 */
public class SingletonTest03 {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance == instance2);
        System.out.println("instance.hashCode=" + instance.hashCode());
        System.out.println("instance2.hashCode=" + instance2.hashCode());

    }
}

/**
 * 懒汉式（线程不安全）
 */
class Singleton {
    /**
     * 声明静态实例变量
     */
    private static Singleton instance;

    /**
     * 构造方法私有化，防止外部创建
     */
    private Singleton() {

    }

    /**
     * 提供一个静态的共有方法，当时用到该方法时才去创建instance
     * 实现了懒加载（Lazy loading）
     *
     * @return
     */
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

}
