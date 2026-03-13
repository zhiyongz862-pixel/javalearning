package HW;

import java.util.Random;
import java.util.Scanner;

//输入任意字符串 打乱其中的内容
public class HW01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        // 变成字符数组的api
        char [] arr = s.toCharArray();
        Random r = new Random();

        for (int i = 0; i < arr.length; i++) {
            int index = r.nextInt(arr.length);
            char temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
        }
        // 这个的构造函数可以接受字符数组
        String ans = new String(arr);
        System.out.println(ans);

    }
}
