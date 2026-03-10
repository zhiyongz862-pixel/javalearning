package HW;

import java.util.Random;

public class HW11 {
    public static void main(String[] args) {
        int [] a = {2,588,888,1000,10000};
        int [] b = new int [a.length];
        Random r  = new Random();
        int count = 0;
        while (count < a.length){
            int index_now = r.nextInt(a.length);
            int num_now = a[index_now];
            if (!include(b,num_now)) {
                b[count] = num_now;
                count++;
            }
        }
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i] + " ");
        }
    }
    public static  boolean include(int [] a ,int value){
        for (int i = 0; i < a.length; i++) {
            if (a[i] == value) return true;
        }
        return false;
    }
}
