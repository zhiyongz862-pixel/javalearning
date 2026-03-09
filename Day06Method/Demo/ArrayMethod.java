package Demo;

public class ArrayMethod {
    public static void main(String[] args) {
        int [] a = {1,2,3,4};
        System.out.println(Max(a));


    }
    //这个int []可以理解为一种数据类型
    public static int Max(int [] a){
        int ans = a[0];
        for (int i = 0; i < a.length; i++) {
            if (ans<a[i]) {ans = a[i];}
        }
        return ans;
    }

}
