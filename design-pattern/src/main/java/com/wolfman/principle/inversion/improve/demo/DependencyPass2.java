package com.wolfman.principle.inversion.improve.demo;

///**
// * 方式2:通过构造方法依赖传递
// */
//interface IOpenAndClose {
//    void open(); //抽象方法
//}
//
///**
// * ITV接口
// */
//interface ITV {
//    void play();
//}
//
//class OpenAndClose implements IOpenAndClose {
//    /**
//     * 成员
//     */
//    public ITV tv;
//
//    /**
//     * 构造器
//     *
//     * @param tv
//     */
//    public OpenAndClose(ITV tv) {
//        this.tv = tv;
//    }
//
//    @Override
//    public void open() {
//        this.tv.play();
//    }
//}
//
//class ChangHong implements ITV {
//
//    @Override
//    public void play() {
//        System.out.println("长虹电视机，打开");
//    }
//}


/**
 * @Title
 * @Description
 * @Author WolfMan
 * @Date 2021/7/21 23:47
 * @Email 2370032534@qq.com
 */
public class DependencyPass2 {
    public static void main(String[] args) {
//        ChangHong changHong = new ChangHong();
//        //通过构造器进行依赖传递
//        OpenAndClose openAndClose = new OpenAndClose(changHong);
//        openAndClose.open();
    }
}



