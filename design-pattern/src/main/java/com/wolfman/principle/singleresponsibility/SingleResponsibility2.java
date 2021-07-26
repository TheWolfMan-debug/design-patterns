package com.wolfman.principle.singleresponsibility;

/**
 * @Title
 * @Description
 * @Author WolfMan
 * @Date 2021/7/21 22:13
 * @Email 2370032534@qq.com
 */
public class SingleResponsibility2 {

    public static void main(String[] args) {
        RoadVehicle roadVehicle = new RoadVehicle();
        roadVehicle.run("汽车");
        AirVehicle airVehicle = new AirVehicle();
        airVehicle.run("飞机");
        WaterVehicle waterVehicle = new WaterVehicle();
        waterVehicle.run("潜水艇");
    }


}

/**
 * 公路运行
 */
class RoadVehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + "公路运行");
    }
}

/**
 * 天空运行
 */
class AirVehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + "天空运行");
    }
}

/**
 * 水中运行
 */
class WaterVehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + "水中运行");
    }
}