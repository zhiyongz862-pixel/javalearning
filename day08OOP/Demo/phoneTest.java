package Demo;

public class phoneTest {

    public static void main(String[] args) {
        Phone p = new Phone();
        //赋值
        p.brand = "小米";
        p.price = 200.0;
        System.out.println(p.brand);
        p.call();
        
    }
}
