package com.wolfman.principle.inversion.improve;

/**
 * 定义接口
 */
interface IReceiver {
    String getInfo();
}

/**
 * @Title
 * @Description
 * @Author WolfMan
 * @Date 2021/7/21 23:46
 * @Email 2370032534@qq.com
 */
public class DependencyInversion {
    public static void main(String[] args) {
        //客户端无需改变
        Person person = new Person();
        person.receive(new Email());
        person.receive(new WeiXin());
    }
}

/**
 * 邮件方式
 */
class Email implements IReceiver {
    @Override
    public String getInfo() {
        return "电子邮件信息: hello,world";
    }
}

/**
 * 微信方式
 */
class WeiXin implements IReceiver {
    @Override
    public String getInfo() {
        return "微信信息: hello,ok";
    }
}

/**
 * 对抽象依赖
 */
class Person {
    /**
     * 这里我们是对接口的依赖
     *
     * @param receiver
     */
    public void receive(IReceiver receiver) {
        System.out.println(receiver.getInfo());
    }
}
