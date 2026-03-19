package Demo;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class Myarray {
    public static void main(String[] args) {
        int [] a ={1,2,3,4,5,6,7,8,9,10};
        // 转换成字符串
        System.out.println(Arrays.toString(a));
        // 如果没找到 ,就是-插入点-1
        System.out.println(Arrays.binarySearch(a,4));

        Integer [] arr = {1, 2, 3, 4, 57, 6, 8};

        // 如果指定规则arr要是Integer，第二个参数要用匿名内部类重写方法
        // o1代表无需元素 o2代表有序元素 返回正数代表当前插入元素是大的，放在后面
        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return (o2-o1);
            }
        });
        System.out.println(Arrays.toString(arr));
    }
}
