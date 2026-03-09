package HW;

public class HW09 {
    public static void main(String[] args) {
        int [] a = {1,2,3,4};
        int [] b = copyOf(a,3);
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }

    }
    public static  int [] copyOf(int [] a, int new_length){
        int [] b = new int [new_length];
        for (int i = 0; i < new_length; i++) {
            b[i] = a[i];
        }
        return b;
    }

}
