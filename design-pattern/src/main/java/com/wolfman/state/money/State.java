package com.wolfman.state.money;

/**
 * 状态接口
 *
 * @author Administrator
 */
public interface State {

    /**
     * 电审
     *
     * @param context
     */
    void checkEvent(Context context);

    /**
     * 电审失败
     *
     * @param context
     */
    void checkFailEvent(Context context);

    /**
     * 定价发布
     *
     * @param context
     */
    void makePriceEvent(Context context);

    /**
     * 接单
     *
     * @param context
     */
    void acceptOrderEvent(Context context);

    /**
     * 无人接单失效
     *
     * @param context
     */
    void notPeopleAcceptEvent(Context context);

    /**
     * 付款
     *
     * @param context
     */
    void payOrderEvent(Context context);

    /**
     * 接单有人支付失效
     *
     * @param context
     */
    void orderFailureEvent(Context context);

    /**
     * 反馈
     *
     * @param context
     */
    void feedBackEvent(Context context);

    /**
     * 获取当前状态
     * @return
     */
    String getCurrentState();
}
