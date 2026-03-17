package com.itheima.ui;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

// 代表主界面，所有跟主界面相关的业务逻辑都写在这个里面
// 继承 键盘listener接口，这样就能在本类中重写键盘监听方法，并且在this.addLisener当中传入this对象，作为接口的实现类，这样写比较简便
public class GameJFrame extends JFrame implements KeyListener,ActionListener {
    // 会根据二维数据的值打乱图片
    int[][] ans = new int[4][4];
    // 记录空白位置在哪里的两个变量
    int x_empty = 0;
    int y_empty = 0;

    // 创建两个选项下面的条目对象 设成成员变量是因为下面点击他的时候 e.getSource 要知道我当前点击的是哪个对象
    JMenuItem replayItem = new JMenuItem("重新游戏");
    JMenuItem reloginItem = new JMenuItem("重新登陆");
    JMenuItem exitItem = new JMenuItem("关闭游戏");
    JMenuItem AccountItem = new JMenuItem("公众号");

    // 用来统计部属
    int count_step;

    public GameJFrame() {
        // 初始化每个小窗口
        initJFrame();
        // 初始化上边的菜单栏以及对应的选项
        initBar();

        // 初始化数据用于打乱图片
        initData();
        // 初始化图片，把图片加载到这个类当中
        initImage();
        //显示出来
        this.setVisible(true);

    }

    private void initData() {
        int[] temp = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        // 打乱数组
        for (int i = 0; i < temp.length; i++) {
            java.util.Random r = new java.util.Random();
            int idx = r.nextInt(16);
            int temp_v = temp[idx];
            temp[idx] = temp[i];
            temp[i] = temp_v;
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                // 记录当前0在什么位置
                if (temp[i*4+j]==0){
                    x_empty = i;
                    y_empty = j;
                }
                ans[i][j] = temp[i * 4 + j];
            }
        }


    }
    // 先做的在最上面
    private void initImage() {
        // 清空整个界面
        this.getContentPane().removeAll();
        // 这个可以显示文字
        JLabel setCount = new JLabel("步数" + count_step);
        setCount.setBounds(50,30,100,20);
        this.getContentPane().add(setCount);

        if (checkVictory()) {
            //System.out.println("我到了");
            ImageIcon vic = new ImageIcon("/Users/zhengzhiyong/Desktop/learning/java/javalearning/Day16And17OOPExercise/素材/素材/image/win.png");
            JLabel vic_jlabel = new JLabel(vic);
            vic_jlabel.setBounds(203,283,197,73);
            this.add(vic_jlabel);
        }
        // 先加载的在上方，后加载的在下方
        // 循环16次，多写一次，加载个空白
        for (int i = 0; i <= 15; i++) {
            // 定义位置
            int y = ((i / 4) * 105), x = (i % 4) * 105;
            // 创建一个ImageIcon对象,用于读取图片
            // 相对路径是以当前项目开头的
            ImageIcon icon = new ImageIcon("Day16And17OOPExercise/素材/素材/image/animal/animal3/" + ans[i / 4][i % 4] + ".jpg");
            // 把图像放到对应的容器当中
            JLabel jlabel = new JLabel(icon);
            // 坐标以左上角为原点横着为x轴，竖着为Y轴 // 看左上角那个点在哪个位置
            jlabel.setBounds(x + 83, y + 134, 105, 105);
            // 设置斜面边框（给每个小图片）
            jlabel.setBorder(new BevelBorder(1));
            // 把管理容器添加到界面中 默认放到中心
            this.add(jlabel);
        }
        // 添加背景图片
        ImageIcon bg = new ImageIcon("Day16And17OOPExercise/素材/素材/image/background.png");
        JLabel jLabel = new JLabel(bg);
        jLabel.setBounds(40, 40, 508, 560);
        this.add(jLabel);



        // 刷新整个页面 这里一定要写getContentPane()。才能得到对象
        this.getContentPane().repaint();

    }

    private void initBar() {
        // 初始化菜单
        //创建整个菜单对象
        JMenuBar jMenuBar = new JMenuBar();
        // 创建bar上个两个选项的对象
        JMenu functionJMenu = new JMenu("功能");
        JMenu aboutJMenu = new JMenu("关于我们");



        // 将每一个条目放到选项的对象下面
        functionJMenu.add(reloginItem);
        functionJMenu.add(replayItem);
        functionJMenu.add(exitItem);

        // 给按钮添加一个listener
        replayItem.addActionListener(this);
        reloginItem.addActionListener(this);
        exitItem.addActionListener(this);
        AccountItem.addActionListener(this);

        aboutJMenu.add(AccountItem);
        // 将每一个对象放到bar里面
        jMenuBar.add(functionJMenu);
        jMenuBar.add(aboutJMenu);

        //整个界面设置菜单
        //this.setJMenuBar(jMenuBar);
        this.setJMenuBar(jMenuBar);
    }


    private void initJFrame() {
        // 设置界面的宽高
        this.setSize(603, 680);
        // 设置标题
        this.setTitle("拼图单机版v1.0");
        // 一直置顶，也就是随便点击一个页面，他不会隐藏
        this.setAlwaysOnTop(true);
        // 界面一直居中
        this.setLocationRelativeTo(null);

        // 设置界面关闭之后，程序自动停止 （设置关闭模式） 0不管点多少遍x，程序都不会懂 这里写3也是一样的
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // 取消默认的居中放置，只有取消了，才会按照X Y轴方式添加
        this.setLayout(null);

        // 添加键盘监听事件，执行本类中实现的方法（利用了多态，可以把实现接口的对象传递给对应的接口）
        this.addKeyListener(this);

        //// 创建按钮对象
        //JButton jtb = new JButton("点我啊");
        //// 设置对象在什么位置
        //jtb.setBounds(0,0,100,50);
        //// 给对象添加时件监听。表示我要给组件添加哪个事件监听 鼠标左键点击/空格
        //// 这里用匿名实现类
        //jtb.addActionListener(new ActionListener() {
        //    @Override
        //    public void actionPerformed(ActionEvent e) {
        //        System.out.println("已监听到");
        //    }
        //});
        //this.add(jtb);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();
        //System.out.println("process" + code);
        this.getContentPane().removeAll();

        if (code == 65){
            // 我要设置完整图片整出来
            ImageIcon all = new ImageIcon("/Users/zhengzhiyong/Desktop/learning/java/javalearning/Day16And17OOPExercise/素材/素材/image/animal/animal3/all.jpg");
            JLabel all_jlabel = new JLabel(all);
            all_jlabel.setBounds(40,40,508,560);
            this.getContentPane().add(all_jlabel);

            ImageIcon bg = new ImageIcon("Day16And17OOPExercise/素材/素材/image/background.png");
            JLabel jLabel = new JLabel(bg);
            jLabel.setBounds(43, 43, 508, 560);
            this.getContentPane().add(jLabel);
            this.repaint();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

        if (checkVictory()) return ;
        // 得到用户按下了哪个键
        int code = e.getKeyCode();
        // 左 37 上38 右 39 下 40
        switch (code){
            case 37 -> {
                int x_new = x_empty ,y_new = y_empty+1;
                // 一定要能移动
                if (checkBound(x_new,y_new))
                {
                    // 交换位置
                    int temp = ans[x_new][y_new];
                    ans[x_new][y_new] = 0;
                    ans[x_empty][y_empty] = temp;
                    y_empty++;
                    count_step++;
                    // 更新一下图像
                    initImage();
                }
                else{
                    System.out.println("无法移动");
                }
            }
            case 38->{
                int x_new = x_empty +1 ,y_new = y_empty;
                // 一定要能移动
                if (checkBound(x_new,y_new))
                {
                    // 交换位置
                    int temp = ans[x_new][y_new];
                    ans[x_new][y_new] = 0;
                    ans[x_empty][y_empty] = temp;
                    x_empty++;
                    count_step++;
                    // 更新一下图像
                    initImage();
                }
                else{
                    System.out.println("无法移动");
                }
            }
            case 39 -> {
                int x_new = x_empty ,y_new = y_empty-1;
                // 一定要能移动
                if (checkBound(x_new,y_new))
                {
                    // 交换位置
                    int temp = ans[x_new][y_new];
                    ans[x_new][y_new] = 0;
                    ans[x_empty][y_empty] = temp;
                    y_empty--;
                    count_step ++;
                    // 更新一下图像
                    initImage();
                }
                else{
                    System.out.println("无法移动");
                }
            }
            case 40 ->{
                int x_new = x_empty-1 ,y_new = y_empty;
                // 一定要能移动
                if (checkBound(x_new,y_new))
                {
                    // 交换位置
                    int temp = ans[x_new][y_new];
                    ans[x_new][y_new] = 0;
                    ans[x_empty][y_empty] = temp;
                    x_empty--;
                    count_step++;
                    // 更新一下图像
                    initImage();
                }
                else{
                    System.out.println("无法移动");
                }
            }
            case 65 ->{
                initImage();
            }
            case 87->{
                // 但是这样写有个问题 就是结束之后还是能动
                x_empty = 3;
                y_empty = 3;
                this.ans = new int[][]{
                        {1, 2, 3, 4},
                        {5, 6, 7, 8},
                        {9, 10, 11, 12},
                        {13, 14, 15, 0}
                };
                initImage();
            }
            default -> {
                System.out.println("无事发生");
            }
        }

    }
    private boolean checkBound(int x,int y){
        if (x>=4 ||  y>=4 || x<0 || y<0) return false;
        return true;
    }
    private boolean checkVictory(){
        int [][] ans_ul = new int [][]{
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,0}
        };
        for (int i=0 ; i<=3; i++){
            for (int j = 0;j<=3 ;j++){
                if (ans_ul[i][j] != ans[i][j]) return  false;
            }
        }
        return true;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object x = e.getSource();
        if (x==replayItem){
            // 打乱二维数组的图片
            initData();
            // 计数器归0
            count_step = 0;
            // 出图
            initImage();
            System.out.println("重新游戏");

        }
        else if (x == reloginItem){
            // 关闭当前界面
            this.setVisible(false);
            // 设置进入登陆界面
            new LoginJFrame();
            System.out.println("重新登陆");

        }
        else if (x== exitItem){
            System.exit(0);
        }
        else if (x==AccountItem){
            System.out.println("关于我们");
            // 创建一个弹框对象
            JDialog jdialog = new JDialog();
            JLabel jlabel = new JLabel(new ImageIcon("/Users/zhengzhiyong/Desktop/learning/java/javalearning/Day16And17OOPExercise/素材/素材/image/about.png"));
            jlabel.setBounds(0,0,258,258);
            jdialog.getContentPane().add(jlabel);
            jdialog.setSize(344,344);
            //置顶
            jdialog.setAlwaysOnTop(true);
            // 居中
            jdialog.setLocationRelativeTo(null);
            // 不关闭无法操纵
            jdialog.setModal(true);

            jdialog.setVisible(true);

        }

    }
}
