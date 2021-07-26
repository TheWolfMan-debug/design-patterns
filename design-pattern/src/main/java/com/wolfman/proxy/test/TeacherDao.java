package com.wolfman.proxy.test;

/**
 * @Title
 * @Description
 * @Author WolfMan
 * @Date 2021/7/25 12:24
 * @Email 2370032534@qq.com
 */
public class TeacherDao {

    public String teach() {
        System.out.println("老师授课中，我是cglib代理，不需要实现接口 ");
        return "hello";
    }

}
