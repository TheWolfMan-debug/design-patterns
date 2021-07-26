package com.wolfman.principle.inversion.improve.demo;
//
//
///**
// * 方式1： 通过接口传递实现依赖
// */
//interface IOpenAndClose {
//    /**
//     * 抽象方法,接收接口
//     *
//     * @param tv
//     */
//    void open(ITV tv);
//}
//
//interface ITV {
//    void play();
//}
//
///**
// * 实现接口
// */
//class ChangHong implements ITV {
//
//    @Override
//    public void play() {
//        System.out.println("长虹电视机，打开");
//    }
//
//}
//
///**
// * 实现接口
// */
//class OpenAndClose implements IOpenAndClose {
//    @Override
//    public void open(ITV tv) {
//        tv.play();
//    }
//}
//
/**
 * @Title
 * @Description
 * @Author WolfMan
 * @Date 2021/7/21 23:47
 * @Email 2370032534@qq.com
 */
public class DependencyPass1 {
    public static void main(String[] args) {
//        ChangHong changHong = new ChangHong();
//        OpenAndClose openAndClose = new OpenAndClose();
//        openAndClose.open(changHong);

    }
}
