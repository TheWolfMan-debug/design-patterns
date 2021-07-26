package com.wolfman.principle.inversion;

/**
 * @Title
 * @Description
 * @Author WolfMan
 * @Date 2021/7/21 23:42
 * @Email 2370032534@qq.com
 */
public class DependencyInversion {

    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
    }

}

/**
 * 邮件类
 */
class Email {
    public String getInfo() {
        return "电子邮件信息: hello,world";
    }
}

/**
 * 完成Person接收消息的功能
 */
class Person {
    public void receive(Email email) {
        System.out.println(email.getInfo());
    }
}

