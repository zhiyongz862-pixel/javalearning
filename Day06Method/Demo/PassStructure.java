package Demo;
// 方法的值传递和引用传递的对比
public class PassStructure {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a);
        change_number(a);
        //这里a是不变的，因为a是普通变量
        System.out.println(a);

        int [] arr = {1,2,3,4};
        System.out.println(arr[1]);
        change_arr(arr);
        //这里是变的，因为是引用
        System.out.println(arr[1]);

    }
    public static  void change_number(int a){
        a = 20;
    }
    public static void change_arr(int [] a){
        a[1] = 10;
    }
}
