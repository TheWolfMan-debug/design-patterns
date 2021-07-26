package com.wolfman.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @Title
 * @Description
 * @Author WolfMan
 * @Date 2021/7/24 19:19
 * @Email 2370032534@qq.com
 */
public class College extends OrganizationComponent {

    /**
     * List 中 存放的Department
     */
    List<OrganizationComponent> organizationComponents = new ArrayList<OrganizationComponent>();

    public College(String name, String des) {
        super(name, des);
    }

    /**
     * 重写add
     *
     * @param organizationComponent
     */
    @Override
    protected void add(OrganizationComponent organizationComponent) {
        organizationComponents.add(organizationComponent);
    }

    /**
     * 重写remove
     *
     * @param organizationComponent
     */
    @Override
    protected void remove(OrganizationComponent organizationComponent) {
        organizationComponents.remove(organizationComponent);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDes() {
        return super.getDes();
    }

    /**
     * print方法，就是输出University 包含的系
     */
    @Override
    protected void print() {
        System.out.println("--------------" + getName() + "--------------");
        //遍历 organizationComponents
        for (OrganizationComponent organizationComponent : organizationComponents) {
            organizationComponent.print();
        }
    }

}
