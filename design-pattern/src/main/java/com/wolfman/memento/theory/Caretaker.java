package com.wolfman.memento.theory;

import java.util.ArrayList;
import java.util.List;

/**
 * 保存状态的对象
 */
public class Caretaker {

    /**
     * 在List 集合中会有很多的备忘录对象
     */
    private List<Memento> mementoList = new ArrayList<>();

    public void add(Memento memento) {
        mementoList.add(memento);
    }

    /**
     * 获取到第index个Originator 的 备忘录对象(即保存状态)
     *
     * @param index
     * @return
     */
    public Memento get(int index) {
        return mementoList.get(index);
    }
}
