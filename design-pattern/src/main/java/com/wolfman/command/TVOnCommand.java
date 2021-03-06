package com.wolfman.command;

public class TVOnCommand implements Command {

    /**
     * 聚合TVReceiver
     */
    TVReceiver tv;

    public TVOnCommand(TVReceiver tv) {
        super();
        this.tv = tv;
    }

    @Override
    public void execute() {
        // 调用接收者的方法
        tv.on();
    }

    @Override
    public void undo() {
        // 调用接收者的方法
        tv.off();
    }
}
