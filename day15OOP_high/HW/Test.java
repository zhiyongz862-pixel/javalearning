package HW;
//​	在测试类Test中创建A的对象a并调用成员方法methodA(),要求用两种方式实现
//
//​	自己书写，不要用idea自动生成。
public class Test {
    public static void main(String[] args) {
        A a = new A();
        a.methodA(new InterA() {
                      @Override
                      public void showA() {
                          System.out.println("dd");
                      }
                  }


        );

    }
}

//定义接口
interface InterA {
    void showA();
}

class A {
    public void methodA(InterA a) {
        a.showA();
    }
}