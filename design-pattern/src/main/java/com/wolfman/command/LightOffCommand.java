package com.wolfman.command;

public class LightOffCommand implements Command {

    /**
     * 聚合LightReceiver
     */
    LightReceiver light;

    public LightOffCommand(LightReceiver light) {
        super();
        this.light = light;
    }

    @Override
    public void execute() {
        // 调用接收者的方法
        light.off();
    }

    @Override
    public void undo() {
        // 调用接收者的方法
        light.on();
    }
}
