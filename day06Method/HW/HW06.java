package HW;
//查看两个数组是否相等
public class HW06 {
    public static void main(String[] args) {
        int [] a = {1,2,3,4};
        int [] b = {1,2,4};
        System.out.println(equal(a,b));
    }
    public static  boolean equal(int [] a,int [] b){
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }
}
