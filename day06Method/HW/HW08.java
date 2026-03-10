package HW;

public class HW08 {
    public static void main(String[] args) {
        int [] a = {1,2,3,4};
        fill(a,5,1,3);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }    }
    public static  void fill(int [] a,int value,int from,int to){
        for (int i = from; i < to; i++) {
            a[i] = value;
        }
    }
}
