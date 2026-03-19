package demo;

import java.io.IOException;

// Runtime api的学习
// 这个api不能创建对象，但是它里面的方法又不是静态的，也就是需要创建对象才能调用，这看似很奇怪
// 这是java的小巧思，他通过一个static方法返回一个对象，保证在一个java城中，只有一个Runtime对象
public class Runtime_me {
    public static void main(String[] args) throws IOException {
        // 这个是错误的，不能声明他的对象

        // 获取线程数 我是8核心 CPU线程数目
        java.lang.System.out.println(Runtime.getRuntime().availableProcessors());
        // 获取JVM能从系统中获得的总内存大小（单位 字节） 6144MB
        java.lang.System.out.println((Runtime.getRuntime().maxMemory()/ 1024 )/1024);
        // 已经获得的
        java.lang.System.out.println((Runtime.getRuntime().totalMemory()/ 1024 )/1024);
        // 剩余内存
        java.lang.System.out.println((Runtime.getRuntime().freeMemory()/ 1024 )/1024);
        // 执行cmd命令
        Process ls = Runtime.getRuntime().exec("ls");
        // 停止虚拟机
        // ，也是System.exit(0)的实现
        java.lang.Runtime.getRuntime().exit(0);
    }

}
