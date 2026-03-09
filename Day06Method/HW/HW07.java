package HW;

public class HW07 {
    public static void main(String[] args) {
        int [] a = {1,2,3,4};
        fil(a,4);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
    public static  void fil(int [] a ,int value){
        for (int i = 0; i < a.length; i++) {
            a[i] = value;
        }
    }
}
