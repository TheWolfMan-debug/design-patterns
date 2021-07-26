package com.wolfman.facade.facade;

/**
 * @Title
 * @Description
 * @Author WolfMan
 * @Date 2021/7/24 20:47
 * @Email 2370032534@qq.com
 */
public class Client {
    public static void main(String[] args) {
        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade();
        homeTheaterFacade.ready();
        homeTheaterFacade.play();
        homeTheaterFacade.end();
    }

}
