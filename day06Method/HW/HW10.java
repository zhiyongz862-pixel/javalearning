package HW;

public class HW10 {
    public static void main(String[] args) {
        int [] a = {1,2,3,4};
        int [] b = copyOf(a,1,3);
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }

    }
    public static  int [] copyOf(int [] a, int from ,int to){
        int [] b = new int [to - from];
        for (int i = from; i < to; i++) {
            b[i-from] = a[i];
        }
        return b;
    }

}
