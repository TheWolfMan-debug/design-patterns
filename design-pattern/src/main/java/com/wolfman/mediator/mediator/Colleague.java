package com.wolfman.mediator.mediator;

/**
 * 同事抽象类
 */
public abstract class Colleague {
    public String name;
    private Mediator mediator;

    public Colleague(Mediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;

    }

    public Mediator GetMediator() {
        return this.mediator;
    }

    /**
     * 发送信息
     *
     * @param stateChange
     */
    public abstract void SendMessage(int stateChange);
}
