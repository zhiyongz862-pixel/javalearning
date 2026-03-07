package hw;

public class hw03 {
    public static void main(String[] args) {
        int x1 = 24,x2 = 8 ,x3 = 3;
        double  ans1 = (x1 + x2 + x3 ) * 0.8 , ans2 = 16 + x2 + x3;
        double res = ans1 > ans2 ? ans2 : ans1;
        System.out.println(res);
        //1.求不使用优惠时的总价
        //double money1 = 24 + 8 + 3;
        ////2.判断折后总价
        //money1 = (money1 >= 30 ? money1 * 0.8 : money1);
        ////3.求使用优惠时的总价
        //double money2 = 16 + 8 + 3;
        ////4.判断两种花费哪个更少
        //double money = money1 < money2 ? money1 : money2;
        ////5.打印最终花费
        //System.out.println(money);
    }
}
