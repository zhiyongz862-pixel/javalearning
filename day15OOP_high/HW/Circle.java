package HW;

public class Circle extends  Shape{
    private  double radius;
    private  final double PI = 3.14;

    public Circle() {
    }

    public Circle(double radius, double PI) {
        super();
        this.radius = radius;
    }

    @Override
    double getArea() {
        return PI * radius * radius;
    }

    @Override
    double getPerimeter() {
        //return 0;
        return PI * 2 * radius;
    }

    /**
     * 获取
     * @return radius
     */
    public double getRadius() {
        return radius;
    }

    /**
     * 设置
     * @param radius
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String toString() {
        return "Circle{radius = " + radius + ", PI = " + PI + "}";
    }
}
