package com.itheima.ui;

import javax.swing.*;
// 注册相关的业务逻辑
public class RegisterJFrame extends JFrame {
    public RegisterJFrame(){
        this.setSize(488,500);
        this.setTitle("注册界面");
        // 一直置顶，也就是随便点击一个页面，他不会隐藏
        this.setAlwaysOnTop(true);
        // 界面一直居中
        this.setLocationRelativeTo(null);

        // 设置界面关闭之后，程序自动停止 （设置关闭模式） 0不管点多少遍x，程序都不会懂 这里写3也是一样的
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //显示出来
        this.setVisible(true);
    }
}
