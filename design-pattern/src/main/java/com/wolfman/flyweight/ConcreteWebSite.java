package com.wolfman.flyweight;

/**
 * @Title
 * @Description
 * @Author WolfMan
 * @Date 2021/7/25 0:12
 * @Email 2370032534@qq.com
 */
public class ConcreteWebSite extends WebSite {
    /**
     * 共享的部分，内部状态 网站发布的形式(类型)
     */
    private String type = "";

    public ConcreteWebSite(String type) {
        this.type = type;
    }

    @Override
    public void use(User user) {
        System.out.println("网站的发布形式为:" + type + " 在使用中 .. 使用者是" + user.getName());
    }
}
