//如何进行输入
package  Demo;
//第一步导包
import java.util.Scanner;
public class input
{
    public static  void main(String[] args)
    {
        // 第二步 创建对象，表示要开始使用Scanner这个类了
        Scanner sc = new Scanner(System.in);
        // 第三步，接收数据，真正开始干活了 变量i记录了键盘录入的数据
        int i = sc.nextInt();
        System.out.println(i);


    }


}