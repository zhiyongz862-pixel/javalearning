package HW;

public class HW02 {
    public static void main(String[] args) {
        double [] d = new double [] {12.9, 53.54, 75.0, 99.1, 3.14};
        double ans = d[0];
        //现在还没用增强的for
        for (int i = 0; i < d.length; i++) {
            if (ans>d[i]){
                ans = d[i];
            }
        }
        System.out.println(ans);
    }
}
