package demo;

import java.math.BigInteger;

public class bigintenger {
    public static void main(String[] args) {
        // 可以这样得到大整数，但是这样只能在long的范围内
        BigInteger b = BigInteger.valueOf(12);
        // 另外一种获得大整数的方法
        BigInteger c = new BigInteger("2323");
        // 大整数对象和string一样，创建了就不会改变
        BigInteger add = b.add(c);
        java.lang.System.out.println(add);
    }
}
