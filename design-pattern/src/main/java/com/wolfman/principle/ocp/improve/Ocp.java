package com.wolfman.principle.ocp.improve;

/**
 * @Title
 * @Description
 * @Author WolfMan
 * @Date 2021/7/22 0:56
 * @Email 2370032534@qq.com
 */
public class Ocp {
    public static void main(String[] args) {
        //改进后
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShape(new Rectangle());
        graphicEditor.drawShape(new Circle());
        graphicEditor.drawShape(new Triangle());
        graphicEditor.drawShape(new OtherGraphic());
    }
}

/**
 * 这是一个用于绘图的类 [使用方]
 */
class GraphicEditor {
    /**
     * 接收Shape对象，调用draw方法
     *
     * @param s
     */
    public void drawShape(Shape s) {
        s.draw();
    }


}

/**
 * Shape类，基类
 */
abstract class Shape {
    int m_type;

    /**
     * 抽象方法
     */
    public abstract void draw();
}

/**
 * 矩形
 */
class Rectangle extends Shape {
    Rectangle() {
        super.m_type = 1;
    }

    @Override
    public void draw() {
        System.out.println(" 绘制矩形 ");
    }
}

/**
 * 圆形
 */
class Circle extends Shape {
    Circle() {
        super.m_type = 2;
    }

    @Override
    public void draw() {
        System.out.println(" 绘制圆形 ");
    }
}

/**
 * 三角形
 */
class Triangle extends Shape {
    Triangle() {
        super.m_type = 3;
    }

    @Override
    public void draw() {
        System.out.println(" 绘制三角形 ");
    }
}

/**
 * 新增一个图形
 */
class OtherGraphic extends Shape {
    OtherGraphic() {
        super.m_type = 4;
    }

    @Override
    public void draw() {
        System.out.println(" 绘制其它图形 ");
    }
}
