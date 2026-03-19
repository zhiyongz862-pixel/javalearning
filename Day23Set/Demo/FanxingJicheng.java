package Demo;

import java.util.ArrayList;

public class FanxingJicheng {
    public static void main(String[] args) {
        ArrayList<Ye> list1 = new ArrayList<Ye>();
        ArrayList<Fu> list2 = new ArrayList<Fu>();
        ArrayList<Zi> list3 = new ArrayList<Zi>();

        // 正常
        method(list1);
        // 报错 范型没有继承性 但是可以用通配符
        //method(list2);

        // 但是数据有 可以利用多态往列表当中添加
        list1.add(new Fu());

    }

//    ？代表啥都行  ? extends Ye 必须是Ye本身或者是Ye的子类 ？super 是Fu或者Fu的父亲
public static void method(ArrayList<?> list){}

}

class Ye {}
class Fu extends Ye{}
class Zi extends Fu{}
