package com.wolfman.proxy.dynamic;

/**
 * @Title
 * @Description
 * @Author WolfMan
 * @Date 2021/7/25 12:01
 * @Email 2370032534@qq.com
 */
public class TeacherDao implements ITeacherDao {

    @Override
    public void teach() {
        System.out.println(" 老师授课中.... ");
    }

    @Override
    public void sayHello(String name) {
        System.out.println("hello " + name);
    }

}
