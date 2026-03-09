package Demo;
// 这个是数组的学习
public class ArrayStructure {
    public static void main(String[] args) {
    /*指的是一种容器，可以同来存储同种数据类型的多个值。

​	但是数组容器在存储数据的时候，需要结合隐式转换考虑。

比如：

​	定义了一个int类型的数组。那么boolean。double类型的数据是不能存到这个数组中的，

​	但是byte类型，short类型，int类型的数据是可以存到这个数组里面的。*/
        //定义一个数组  静态初始化 数组创建完毕之后，长度就不会变化了
        int [] a = new int [] {11, 22, 33};
        //int [] age = new int [] {11,12,13,14};
        // 这两额高等价的
        int [] age = {11,12,13,14};
        // 会打印数组的地址 [I@36baf30c
        //[代表是个数组 I代表这个数组的数据类型 @间隔符号 36baf30c 16进制表示的地址
        System.out.println(age);
        //访问数组值
        System.out.println(age[1]);

        // 数据存储到数组中
        a[0] = 20;
        // 遍历数组 这个length是属性
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
        //动态初始化 整数默认是全0，String默认是null，浮点数是0.0 char默认初始化时空格 布尔默认时false
        int [] dymatic = new int [10];
        System.out.println(dymatic[1]);

    }
}
