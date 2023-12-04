// 資料型態
package Exercise;

class Circle {
    static double radius = 5;
    static final double pi = 3.1415926;
    static double area = radius * radius * pi;
}

class Triangle {
    static double bottom = 10;
    static double high = 5;
    static double area = bottom * high / 2;
}

class Rectangle {
    static double length = 5;
    static double width = 10;
    static double area = length * width;
}

class Total_Area {
    static double area = Circle.area + Triangle.area + Rectangle.area;
}

public class Ex1_Type {
    public static void main(String[] args) {
        System.out.println("Ex1_Type:");
        System.out.println("圓形面積為:" + Circle.area);
        System.out.println("三角形面積為:" + Triangle.area);
        System.out.println("方形面積為:" + Rectangle.area);
        System.out.println("此圖形面積為:" + Total_Area.area);
    }
}