package com.wolfman.prototype.improve;

/**
 * @Title
 * @Description
 * @Author WolfMan
 * @Date 2021/7/23 8:20
 * @Email 2370032534@qq.com
 */
public class Client {
    public static void main(String[] args) {
        Sheep sheep1 = new Sheep("tom", 1, "白色");
        sheep1.setFriend(new Sheep("jack", 2, "黑色"));
        Sheep sheep2 = (Sheep) sheep1.clone();
        Sheep sheep3 = (Sheep) sheep1.clone();
        Sheep sheep4 = (Sheep) sheep1.clone();
        Sheep sheep5 = (Sheep) sheep1.clone();
        System.out.println(sheep1 + "friend.hashcode()=" + sheep1.getFriend().hashCode());
        System.out.println(sheep2 + "friend.hashcode()=" + sheep2.getFriend().hashCode());
        System.out.println(sheep3 + "friend.hashcode()=" + sheep3.getFriend().hashCode());
        System.out.println(sheep4 + "friend.hashcode()=" + sheep4.getFriend().hashCode());
        System.out.println(sheep5 + "friend.hashcode()=" + sheep5.getFriend().hashCode());
    }
}
