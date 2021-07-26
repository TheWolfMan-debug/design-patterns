package com.wolfman.principle.singleresponsibility;

/**
 * @Title
 * @Description
 * @Author WolfMan
 * @Date 2021/7/21 22:20
 * @Email 2370032534@qq.com
 */
public class SingleResponsibility3 {

    public static void main(String[] args) {
        Vehicle2 vehicle2 = new Vehicle2();
        vehicle2.runRoad("汽车");
        vehicle2.runWater("轮船");
        vehicle2.runAir("飞机");
    }

}


class Vehicle2 {
    public void runRoad(String vehicle) {
        System.out.println(vehicle + " 在公路上运行....");
    }

    public void runAir(String vehicle) {
        System.out.println(vehicle + " 在天空上运行....");
    }

    public void runWater(String vehicle) {
        System.out.println(vehicle + " 在水中行....");
    }
}
