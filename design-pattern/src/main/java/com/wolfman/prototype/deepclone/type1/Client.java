package com.wolfman.prototype.deepclone.type1;

/**
 * @Title
 * @Description
 * @Author WolfMan
 * @Date 2021/7/23 8:20
 * @Email 2370032534@qq.com
 */
public class Client {
    public static void main(String[] args) throws Exception {
        DeepProtoType deepProtoType1 = new DeepProtoType();
        deepProtoType1.name = "狼族少年";
        deepProtoType1.deepCloneableTarget = new DeepCloneableTarget("小明", "小张");
        DeepProtoType deepProtoType2 = (DeepProtoType) deepProtoType1.clone();
        System.out.println(deepProtoType1 + "deepCloneableTarget.hashcode=" + deepProtoType1.deepCloneableTarget.hashCode());
        System.out.println(deepProtoType2 + "deepCloneableTarget.hashcode=" + deepProtoType2.deepCloneableTarget.hashCode());
        System.out.println(deepProtoType1 == deepProtoType2);
    }
}
