package HW;

public class HW04 {
    public static void main(String[] args) {
        int [] a = new int [] {2, 1, 3, 5, 4};
        int ans = 0;
        for (int i = 0; i < a.length; i++) {
            ans = ans * 10 + a[i];
        }
        System.out.println(ans);
    }
}
