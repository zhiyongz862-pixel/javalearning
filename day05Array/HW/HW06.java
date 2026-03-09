package HW;

import java.util.Scanner;

public class HW06 {
    public static void main(String[] args) {
        int [] a = new int [] {12,14,23,45,66,68,70,77,90,91};
        int [] ans = new int [a.length+1];
        Scanner sc = new Scanner(System.in);
        int insert = sc.nextInt(),index = a.length;
        //找到放的位置
        for (int i = 0; i < a.length; i++) {
            if (insert<a[i]){
                index = i;
                break;
            }
        }
        for (int i = 0; i < ans.length ; i++) {
            if (index<i){
                ans[i] = a[i-1];
            }else if (index>i) { ans[i] = a[i];
            }else {ans[i] = insert;
            }
        }
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }

    }
}
