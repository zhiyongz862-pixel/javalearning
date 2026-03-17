package com.itheima.ui;

import javax.swing.*;
// 代表登陆界面，所有跟登陆相关的都写在这个里面
public class LoginJFrame extends JFrame {
    public LoginJFrame(){
        // 调用构造函数的时候，就创建好
        this.setSize(488,430);
        this.setTitle("登陆界面");
        // 一直置顶，也就是随便点击一个页面，他不会隐藏
        this.setAlwaysOnTop(true);
        // 界面一直居中
        this.setLocationRelativeTo(null);

        // 设置界面关闭之后，程序自动停止 （设置关闭模式） 0不管点多少遍x，程序都不会懂 这里写3也是一样的
        // 关掉一个 就全部关闭
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //显示出来
        this.setVisible(true);
    }
}
