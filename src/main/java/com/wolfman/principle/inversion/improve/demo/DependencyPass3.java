package com.wolfman.principle.inversion.improve.demo;

/**
 * 方式3 , 通过setter方法传递
 */
interface IOpenAndClose {
    void open();

    void setTv(ITV tv);
}

/**
 * ITV接口
 */
interface ITV {
    void play();
}

class OpenAndClose implements IOpenAndClose {
    private ITV tv;

    @Override
    public void setTv(ITV tv) {
        this.tv = tv;
    }

    @Override
    public void open() {
        this.tv.play();
    }
}

class ChangHong implements ITV {

    @Override
    public void play() {
        System.out.println("长虹电视机，打开");
    }
}


/**
 * @Title
 * @Description
 * @Author WolfMan
 * @Date 2021/7/21 23:47
 * @Email 2370032534@qq.com
 */
public class DependencyPass3 {
    public static void main(String[] args) {
        ChangHong changHong = new ChangHong();
        //通过setter方法进行依赖传递
        OpenAndClose openAndClose = new OpenAndClose();
        openAndClose.setTv(changHong);
        openAndClose.open();

    }
}