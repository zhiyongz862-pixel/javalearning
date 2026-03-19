package Demo;

import java.util.ArrayList;

// 增强for底层就是迭代器
// 单列集合和数组可以用增强for
public class EnhanceFor {
    public static void main(String[] args) {
        int [] a = {1,2,3,4};
        // 这个是语法 一定要注意前面的 int
        for (int a_single : a){
            System.out.println(a_single);
        }
    }
}
