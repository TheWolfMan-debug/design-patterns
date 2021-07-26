package com.wolfman.prototype.deepclone.type2;

import java.io.*;

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
     * 深拷贝，使用序列化方法
     *
     * @return
     * @throws CloneNotSupportedException
     */
    public Object deepClone() {
        //创建流对象
        ByteArrayOutputStream bos;
        ObjectOutputStream oos;
        ByteArrayInputStream bis;
        ObjectInputStream ois;
        try {
            //创建输出流
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            //序列化
            oos.writeObject(this);

            //创建输入流
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            //反序列化
            DeepProtoType o = (DeepProtoType) ois.readObject();
            return o;
        } catch (Exception e) {
        }
        return null;
    }

    @Override
    public String toString() {
        return "DeepProtoType{" +
                "name='" + name + '\'' +
                ", deepCloneableTarget=" + deepCloneableTarget +
                '}';
    }
}
