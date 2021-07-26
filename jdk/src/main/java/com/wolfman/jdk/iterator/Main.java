package com.wolfman.jdk.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Title
 * @Description
 * @Author WolfMan
 * @Date 2021/7/26 11:42
 * @Email 2370032534@qq.com
 */
public class Main {

    public static void main(String[] args) {
        List<String> a = new ArrayList<>();
        a.add("jack");
        // 获取到迭代器
        Iterator Itr = a.iterator();
        while (Itr.hasNext()) {
            System.out.println(Itr.next());
        }

    }

}
