package HW;
// 生成验证码 可以是小写 也可以是大写 还可以是数字

import Demo.StringBuilder;

import java.util.Random;

//长度为5
//
//内容中是四位字母，1位数字。
//
//其中数字只有1位，但是可以出现在任意的位置。
public class HW02 {
    public static void main(String[] args) {
        // 打表
        char[] arr = new char[52];
        for (int i = 0; i < 26; i++) {
            arr[i] = (char) ('A' + i);
        }
        for (int i = 26; i < arr.length; i++) {
            arr[i] = (char) ('a' + i - 26);
        }
        Random r = new Random();
        java.lang.StringBuilder s = new java.lang.StringBuilder();
        for (int i = 0; i < 5; i++) {
            if (i<4){
                int index = r.nextInt(52);
                s.append(arr[index]);
            }
            else {
                int x = r.nextInt(10);
                // 这里的append也是数字，不是ascii码
                s.append(x);
            }
        }

        System.out.println(s);
    //     下面打乱即可


    }

}
