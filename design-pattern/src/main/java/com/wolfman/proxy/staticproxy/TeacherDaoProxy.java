package com.wolfman.proxy.staticproxy;

/**
 * @Title
 * @Description
 * @Author WolfMan
 * @Date 2021/7/25 11:24
 * @Email 2370032534@qq.com
 */
public class TeacherDaoProxy implements ITeacherDao {

    /**
     * 目标对象，通过接口来聚合
     */
    private ITeacherDao target;

    public TeacherDaoProxy(ITeacherDao target) {
        this.target = target;
    }

    @Override
    public void teach() {
        //方法
        System.out.println("开始代理  完成某些操作。。。。。 ");
        //调用被代理对象的方法
        target.teach();
        //方法
        System.out.println("提交。。。。。");
    }

}
