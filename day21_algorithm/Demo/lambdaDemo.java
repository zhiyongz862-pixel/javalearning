package Demo;

import java.awt.event.ActionListener;
import java.util.Arrays;

// 学习java中的lambda
// ()->{}  （）代表形式参数 {}方法体 ->语法规范
// 只有一个抽象方法的接口才能用lambda简化（也叫函数式接口） 注解 @Functionalinterface
// 必须是接口+函数式接口

//理下·解 Java Lambda 省略规则，记住这三点就够了：
//
//        1. **参数随你省**：参数类型可以完全不写（由编译器推断），且如果**只有一个参数**，连小括号 `()` 都能扔掉。
//        2. **单行去大括号**：如果方法体只有一行代码，必须同时去掉大括号 `{}` 和分号 `;`。
//        3. **return 捆绑销售**：如果这一行代码有返回值，必须**连同 `return` 关键字和大括号一起去掉**，直接写结果。
//
//
//
//        ---
//
//        **你想让我帮你把你代码里那个按钮的 `ActionListener` 用这三句话重写成最简版吗？**
public class lambdaDemo {
    public static void main(String[] args) {
        Integer [] a = {1,2,3,4,5,6,7,8,9,10};
        Arrays.sort(a,(Integer o1,Integer o2)->{
            return (o1-o2);
        });
    }
}
