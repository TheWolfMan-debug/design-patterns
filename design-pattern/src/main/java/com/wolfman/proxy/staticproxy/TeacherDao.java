package com.wolfman.proxy.staticproxy;

/**
 * @Title
 * @Description
 * @Author WolfMan
 * @Date 2021/7/25 11:23
 * @Email 2370032534@qq.com
 */
public class TeacherDao implements ITeacherDao {

    @Override
    public void teach() {
        System.out.println("老师授课中  。。。。。");
    }


}
