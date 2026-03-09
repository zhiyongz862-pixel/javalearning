package Demo;
// 这个是使用random这个类的学习
import java.util.Random;

public class RamdomStructure {
    public static void main(String[] args) {
        Random r = new Random();
        // 这个100代表范围 0-99 包头不包尾，包左不包右
        int x = r.nextInt(100);
        System.out.println(x);

        // 生成7-15
        int number = r.nextInt(9) + 7;
    }
}
