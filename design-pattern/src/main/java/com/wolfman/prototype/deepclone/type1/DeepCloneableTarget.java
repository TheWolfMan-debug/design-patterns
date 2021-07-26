package com.wolfman.prototype.deepclone.type1;

import java.io.Serializable;

/**
 * @Title
 * @Description
 * @Author WolfMan
 * @Date 2021/7/23 12:11
 * @Email 2370032534@qq.com
 */
public class DeepCloneableTarget implements Serializable, Cloneable {

    private static final long serialVersionUID = 1L;

    /**
     * 基本数据类型
     */
    private String cloneName;

    /**
     * 基本数据类型
     */
    private String cloneClass;

    public DeepCloneableTarget(String cloneName, String cloneClass) {
        this.cloneName = cloneName;
        this.cloneClass = cloneClass;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "DeepCloneableTarget{" +
                "cloneName='" + cloneName + '\'' +
                ", cloneClass='" + cloneClass + '\'' +
                '}';
    }
}
