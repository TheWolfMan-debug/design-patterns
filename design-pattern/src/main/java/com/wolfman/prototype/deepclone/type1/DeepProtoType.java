package com.wolfman.prototype.deepclone.type1;

import java.io.Serializable;

/**
 * @Title
 * @Description
 * @Author WolfMan
 * @Date 2021/7/23 12:15
 * @Email 2370032534@qq.com
 */
public class DeepProtoType implements Serializable, Cloneable {

    /**
     * 基本数据类型
     */
    public String name;

    /**
     * 引用数据类型
     */
    public DeepCloneableTarget deepCloneableTarget;

    /**
     * 深拷贝，使用重写clone()方法
     *
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        //调用父类中的clone方法，克隆基本数据类型
        DeepProtoType deep = (DeepProtoType) super.clone();
        //调用引用对象中的clone方法，创建新的引用的对象
        deep.deepCloneableTarget = (DeepCloneableTarget) deepCloneableTarget.clone();
        return deep;
    }

    @Override
    public String toString() {
        return "DeepProtoType{" +
                "name='" + name + '\'' +
                ", deepCloneableTarget=" + deepCloneableTarget +
                '}';
    }
}
