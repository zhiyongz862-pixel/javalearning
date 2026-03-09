package HW;

import java.util.Scanner;
//查看一个数有几位
public class HW05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(getNumber(sc.nextInt()));
    }
    public static  int getNumber(int x){
        int ans = 0;
        while(x!=0){
            x /= 10;
            ans++;
        }
        return ans;
    }
}
