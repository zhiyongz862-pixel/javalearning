package com.itheima.Test;

public class Random {
    public static void main(String[] args) {
        int [] temp = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        // 打乱数组
        for (int i = 0; i < temp.length; i++) {
            java.util.Random r = new java.util.Random();
            int idx = r.nextInt(16);
            int temp_v = temp[idx];
            temp[idx] = temp[i];
            temp[i] = temp_v;
        }
        for (int i = 0; i < temp.length; i++) {
            System.out.print(temp[i]+ " ");
        }
        System.out.println();
        int [][] ans = new int [4][4];
        for(int i = 0 ;i<4 ;i++)
        {
            for(int j=0;j<4;j++)
            {
                ans[i][j] = temp[i*4+j];
            }
        }

        for(int i = 0 ;i<4 ;i++)
        {
            for(int j=0;j<4;j++)
            {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }

    }
}
