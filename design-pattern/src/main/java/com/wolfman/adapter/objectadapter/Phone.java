package com.wolfman.adapter.objectadapter;


/**
 * @Title
 * @Description
 * @Author WolfMan
 * @Date 2021/7/23 23:56
 * @Email 2370032534@qq.com
 */
public class Phone {

    /**
     * 充电方法
     *
     * @param iVoltage5V
     */
    public void charging(IVoltage5V iVoltage5V) {
        if (iVoltage5V.output5V() == 5) {
            System.out.println("电压为5V, 可以充电~~");
        } else if (iVoltage5V.output5V() > 5) {
            System.out.println("电压大于5V, 不能充电~~");
        }
    }

}
