package HW;

import java.util.Scanner;

public class HW01 {
    public static void main(String[] args) {
        Car [] c = new Car [3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入品牌");
            String brand = sc.next();
            System.out.println("请输入价格");
            double price = sc.nextDouble();
            System.out.println("请输入颜色");
            String color = sc.next();
            // 这个要在里面定义 不然就是都指向那个地址的值一直在变，存的都是地址，所以都会是那个地址的值
            Car this_car = new Car(brand,price,color);
            c[i] = this_car;

        }
        for (int i = 0; i < 3; i++) {
            System.out.println(c[i].getBrand());
        }
    }
}
