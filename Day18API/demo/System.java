package demo;

public class System {
    public static void main(String[] args) {
        // 获得从1970 1.1到现在的时间 可以用来统计一个程序的执行时间
        long l = java.lang.System.currentTimeMillis();
        java.lang.System.out.println(l);

        int [] a = new int [10];
        int [] b = {1,2,3,4,5,6,7,8,9,10};
        // 从b数组的0索引开始，将a数组的0索引的10个元素拷贝到b中
        java.lang.System.arraycopy(b,0,a,0,10);
        // 关闭整个程序
        java.lang.System.exit(0);
    }
}
