package Demo;

public class ForStructure {
    public static void main(String[] args) {
        int sum = 0;
        for (int i=1; i<=5; i++){
            // 变量在循环结束后回收
            sum += i;
        }
        System.out.println(sum);
    }
}
