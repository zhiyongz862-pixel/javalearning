package demo;
//自增 自减运算
public class AutoIncrement {
    public static void main(String[] args) {
        int a = 10;
        // 先用再加
        a++;
        int b = a++; //11 先用再加
        int c = ++a; // 13 先加再用
        System.out.println(a);

    }
}
