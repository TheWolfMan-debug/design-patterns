package com.wolfman.principle.ocp;

/**
 * @Title
 * @Description
 * @Author WolfMan
 * @Date 2021/7/22 0:40
 * @Email 2370032534@qq.com
 */
public class Ocp {
    public static void main(String[] args) {
        //使用看看存在的问题
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShape(new Rectangle());
        graphicEditor.drawShape(new Circle());
        graphicEditor.drawShape(new Triangle());
    }

}

/**
 * 这是一个用于绘图的类 [使用方]
 */
class GraphicEditor {
    /**
     * 接收Shape对象，然后根据type，来绘制不同的图形
     *
     * @param s
     */
    public void drawShape(Shape s) {
        if (s.m_type == 1) {
            drawRectangle(s);
        } else if (s.m_type == 2) {
            drawCircle(s);
        } else if (s.m_type == 3) {
            drawTriangle(s);
        }
    }

    /**
     * 绘制矩形
     *
     * @param r
     */
    public void drawRectangle(Shape r) {
        System.out.println(" 绘制矩形 ");
    }

    /**
     * 绘制圆形
     *
     * @param r
     */
    public void drawCircle(Shape r) {
        System.out.println(" 绘制圆形 ");
    }

    /**
     * 绘制三角形
     *
     * @param r
     */
    public void drawTriangle(Shape r) {
        System.out.println(" 绘制三角形 ");
    }
}

/**
 * Shape类，基类
 */
class Shape {
    int m_type;
}

/**
 * 矩形类
 */
class Rectangle extends Shape {
    Rectangle() {
        super.m_type = 1;
    }
}

/**
 * 圆形类
 */
class Circle extends Shape {
    Circle() {
        super.m_type = 2;
    }
}

/**
 * 新增画三角形
 */
class Triangle extends Shape {
    Triangle() {
        super.m_type = 3;
    }
}
