package HW;

public class HW01Test {
    public static void main(String[] args) {
        // 调用空参构造方法
        HW01 hw = new HW01();
        //调用有参构造方法
        HW01 hw01 = new HW01("小米",3998,"蓝") ;

        //调用set方法
        hw01.setBrand("华为");
    }
}
