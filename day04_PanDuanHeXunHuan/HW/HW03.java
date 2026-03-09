package HW;

import java.awt.image.BandCombineOp;
import java.util.Scanner;

public class HW03 {
    public static void main(String[] args) {
    /*
    某银行推出了整存整取定期储蓄业务，其存期分为一年、两年、三年、五年，到期凭存单支取本息。存款年利率表如下：

        ​	存期		年利率（%）

        ​	一年		2.25

        ​	两年		2.7

        ​	三年		3.25

        ​	五年		3.6

        请存入一定金额（1000起存），存一定年限（四选一），计算到期后得到的本息总额。

    */
        int balance = 1000;
        System.out.println("请输入存钱年限");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        switch (year){
            case 1 -> {
                System.out.println(balance + balance * 0.0225);
            }
            case 2 -> {
                System.out.println(balance + balance * 2 * 0.027);
            }
            case 3 ->{
                System.out.println(balance + balance * 3 * 0.0325);
            }
            case 5 ->{
                System.out.println(balance + balance * 5 * 0.036);
            }
        }


    }
}
