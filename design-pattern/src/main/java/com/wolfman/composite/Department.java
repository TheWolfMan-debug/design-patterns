package com.wolfman.composite;

/**
 * @Title
 * @Description
 * @Author WolfMan
 * @Date 2021/7/24 19:20
 * @Email 2370032534@qq.com
 */
public class Department extends OrganizationComponent {

    /**
     * 叶子节点，没有集合
     * add , remove 就不用写了，因为他是叶子节点
     *
     * @param name
     * @param des
     */
    public Department(String name, String des) {
        super(name, des);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDes() {
        return super.getDes();
    }

    @Override
    protected void print() {
        System.out.println(getName());
    }

}
