package com.wolfman.spring.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Title
 * @Description
 * @Author WolfMan
 * @Date 2021/7/23 8:54
 * @Email 2370032534@qq.com
 */
public class ProtoType {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        Object monster1 = applicationContext.getBean("monster");
        System.out.println(monster1);
        Object monster2 = applicationContext.getBean("monster");
        System.out.println(monster2);
        System.out.println(monster1 == monster2);
    }
}
