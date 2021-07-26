package com.wolfman.proxy.cglib;

/**
 * @Title
 * @Description
 * @Author WolfMan
 * @Date 2021/7/25 12:25
 * @Email 2370032534@qq.com
 */
public class Client {

    public static void main(String[] args) {
        //创建目标对象
        TeacherDao target = new TeacherDao();
        //获取到代理对象，并且将目标对象传递给代理对象
        TeacherDao proxyInstance = (TeacherDao)new ProxyFactory(target).getProxyInstance();
        //执行代理对象的方法，触发intercept 方法，从而实现 对目标对象的调用
        String res = proxyInstance.teach();
        System.out.println("res=" + res);
    }

}
