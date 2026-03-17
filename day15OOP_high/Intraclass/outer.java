package Intraclass;

public class outer {
    public static void main(String[] args) {
        // 获取成员内部类的对象 左边是类型生命， 有变是要把这个对象new出来
        // 有变的左边是外部类的对象，是调用者，然后再去new对象
        // 但是一般不用，最好是外部类里面定义一个方法返回，这样也简单。
        Outer.Inner oi = new Outer().new Inner();
    }
   static class Outer {
        // 成员内部类，属于外部类对象的。
        // 拓展：成员内部类不能定义静态成员。
        public class Inner{
            // 这里面的东西与类是完全一样的。
            public void method(){
                System.out.println("内部类中的方法被调用了");
            }
        }
    }

}
