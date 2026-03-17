package HW;

public class Rectangle extends Shape{
    private  double Length;
    private  double Wide ;

    public Rectangle() {
    }

    public Rectangle(double Length, double Wide) {
        this.Length = Length;
        this.Wide = Wide;
    }

    @Override
    double getArea() {
        //return 0;
        return Length * Wide ;
    }


    @Override
    double getPerimeter() {
        //return 0;
        return (Length + Wide) * 2;
    }


    /**
     * 获取
     * @return Length
     */
    public double getLength() {
        return Length;
    }

    /**
     * 设置
     * @param Length
     */
    public void setLength(double Length) {
        this.Length = Length;
    }

    /**
     * 获取
     * @return Wide
     */
    public double getWide() {
        return Wide;
    }

    /**
     * 设置
     * @param Wide
     */
    public void setWide(double Wide) {
        this.Wide = Wide;
    }

    public String toString() {
        return "Rectangle{Length = " + Length + ", Wide = " + Wide + "}";
    }
}
