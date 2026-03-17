package Intraclass;
// 怎么样访问内部类变量，对应的外部类变量
public class Test {
    public static void main(String[] args) {
        Outer.inner oi = new Outer().new inner();
        oi.method();
    }
}

class Outer {	// 外部类
    private int a = 30;

    // 在成员位置定义一个类
    class inner {
        private int a = 20;

        public void method() {
            int a = 10;
            System.out.println(a);	// 10   答案：a
            System.out.println(this.a);	// 20	答案：this.a
            // 内部类里面会有Outer.this 这个存储外部类对象的地址值
            System.out.println(Outer.this.a);	// 30	答案：Outer.this.a
        }
    }
}
