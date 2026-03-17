package HW;

interface Inter {
    void show();
}

// 因为是method() 所以一定是个方法
// 但是这个方法的返回值能调用接口的show方法，并且打印hello world 代表这个方法重写过了
class Outer {
    //补齐代码
    public static Inter method(){
        return new Inter() {
            @Override
            public void show() {
                System.out.println("hello world");
            }
        };
    }
}
public class OuterDemo {
    public static void main(String[] args) {
        Outer.method().show();
    }
}

