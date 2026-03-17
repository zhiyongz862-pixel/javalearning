package HW;

public class Test01 {
    public static void main(String[] args) {
        Shape s = new Circle(2,3.14);
        double area = getArea(s);
    }
    public static double  getArea(Shape s){
        if (s instanceof  Circle ){
            Circle c = (Circle) s;
            return c.getArea();
        }
        else if (s instanceof Rectangle r)
            return r.getArea();
        else {
            System.out.println("不存在");
            return -1;
        }

    }
}
