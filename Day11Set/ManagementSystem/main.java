package ManagementSystem;

import java.util.ArrayList;
import java.util.Scanner;

// 先写菜单
public class main {
    public static void main(String[] args) {
        initBoard();
        ArrayList<Student> list = new ArrayList<>();
        Scanner sc =new Scanner(System.in);
        while (true){
            initBoard();
            String choice = sc.next();
            if (choice.equals("1")){addStudent(list); printAll(list);}
            else if (choice.equals("2")) {}
            else if (choice.equals("3")) {}
            else if (choice.equals("4")){
                System.out.println("请输入查询的学生id");
                String id_now = sc.next();
                Student ans = queryStudent(list,id_now);
                if (ans == null){
                    System.out.println("没有这个学生");
                }else{
                    System.out.println(ans);
                }
            }
            else if (choice.equals("5")){break;}
            else {
                System.out.println("输入格式有问题，请重新输入");
            }

        }
    }
    public static  void initBoard(){
        System.out.println("-------------欢迎来到黑马学生管理系统-------------");
        System.out.println("1: 添加学生");
        System.out.println("2: 删除学生");
        System.out.println("3: 修改学生");
        System.out.println("4: 查询学生");
        System.out.println("5: 退出");
        System.out.println("-------------请输入您的选择-------------");
    }
    public static Student queryStudent(ArrayList<Student> l , String id ){
        for (int i = 0; i < l.size(); i++) {
            if (id.equals(l.get(i).getId())){
                return l.get(i);
            }
        }
        return null;

    }
    public static  void  addStudent(ArrayList<Student> l){
        Student s = new Student();
        Scanner sc =new Scanner(System.in);
        String id_now;
        while (true) {
            System.out.println("请输入id");
            id_now = sc.next();
            if (contain(l, id_now)) {
                System.out.println("有重复id，请重新输入");
            }
            else break;
        }
        s.setId(id_now);
        System.out.println("请输入name");
        String name_now = sc.next();
        s.setName(name_now);
        System.out.println("请输入age");
        int age_now = sc.nextInt();
        s.setAge(age_now);
        System.out.println("请输入address");
        String address_now = sc.next();
        s.setAddress(address_now);
        l.add(s);
    }
    public static  boolean contain(ArrayList<Student> l,String id){
        for (int i = 0; i < l.size(); i++) {
         String id_now = l.get(i).getId();
         if (id.equals(id_now)) return true;
        }
        return false;
    }
    public static void printAll(ArrayList<Student> l){
        for (int i = 0; i < l.size(); i++) {
            System.out.println(l.get(i));
        }

    }

}
