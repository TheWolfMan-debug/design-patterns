package com.wolfman.adapter.objectadapter;

/**
 * @Title
 * @Description
 * @Author WolfMan
 * @Date 2021/7/24 0:21
 * @Email 2370032534@qq.com
 */
public class VoltageAdapter implements IVoltage5V {

    /**
     * 聚合
     */
    private Voltage220V voltage220V;

    /**
     * 通过构造器，传入一个 Voltage220V 实例
     *
     * @param voltage220v
     */
    public VoltageAdapter(Voltage220V voltage220v) {
        this.voltage220V = voltage220v;
    }

    @Override
    public int output5V() {
        int dst = 0;
        if (null != voltage220V) {
            //获取220V 电压
            int src = voltage220V.output220V();
            System.out.println("使用对象适配器，进行适配~~");
            //转换成5v电压
            dst = src / 44;
            System.out.println("适配完成，输出的电压为=" + dst);
        }
        return dst;
    }

}
