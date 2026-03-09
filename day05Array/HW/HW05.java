package HW;

public class HW05 {
    public static void main(String[] args) {
        int [] a = new int [] {72, 89, 65, 87, 91, 82, 71, 93, 76, 68};
        int ans = 0;
        for (int i = 0; i < a.length; i++) {
            ans = ans + a[i];
        }
        System.out.println(ans/a.length);
    }
}
