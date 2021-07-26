package com.wolfman.adapter.classadapter;

/**
 * @Title
 * @Description
 * @Author WolfMan
 * @Date 2021/7/23 23:52
 * @Email 2370032534@qq.com
 */
public class VoltageAdapter extends Voltage220V implements IVoltage5V {

    @Override
    public int output5V() {
        //获取到220V电压
        int srcV = output220V();
        //转换成5v电压
        int dstV = srcV / 44;
        return dstV;
    }

}
