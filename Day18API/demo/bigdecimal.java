package demo;

import java.math.BigDecimal;

public class bigdecimal {
    public static void main(String[] args) {
        // 大浮点数，这个类的作用就是防止浮点数精度不够导致的错误
        BigDecimal b = new BigDecimal("100.2");
        // 一般都是这两种方法定义，这种就是要在double范围内整，这个得到的对象在java当中是精确的
        BigDecimal b1 = BigDecimal.valueOf(100.2);

    }
}
