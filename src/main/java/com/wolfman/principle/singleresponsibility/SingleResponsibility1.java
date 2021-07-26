package com.wolfman.principle.singleresponsibility;

/**
 * @Title
 * @Description
 * @Author WolfMan
 * @Date 2021/7/21 22:10
 * @Email 2370032534@qq.com
 */
public class SingleResponsibility1 {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.run("摩托车");
        vehicle.run("汽车");
        vehicle.run("飞机");
    }


}

/**
 * 交通工具类
 */
class Vehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + " 在公路上运行....");
    }
}