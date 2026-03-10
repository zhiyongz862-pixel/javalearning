package Demo;

import java.util.Scanner;

/*	机票价格按照淡季旺季、头等舱和经济舱收费、输入机票原价、月份和头等舱或经济舱。
按照如下规则计算机票价格：旺季（5-10月）头等舱9折，经济舱8.5折，淡季（11月到来年4月）头等舱7折，经济舱6.5折。*/
public class planeTicket {

    public static void main(String[] args) {
        System.out.println("请输入机票原价");
        Scanner sc = new Scanner(System.in);
        double price = sc.nextDouble();
        System.out.println("请输入当前月份");
        int month = sc.nextInt();
        System.out.println("请输入头等舱还是经济舱");
        int cabin = sc.nextInt();
        price = getPrice(month, price, cabin);
        System.out.println(price);

    }

    private static double getPrice(int month, double price, int cabin) {
        if (month >= 5 && month <= 10) {
            price = getADouble(cabin, price);
        } else {
            price = getPrice(cabin, price);
        }
        return price;
    }

    private static double getPrice(int cabin, double price) {
        if (cabin == 0) price = price * 0.7;
        else price = price * 0.65;
        return price;
    }

    private static double getADouble(int cabin, double price) {
        if (cabin == 0) price = price * 0.9;
        else price = price * 0.85;
        return price;
    }

}
