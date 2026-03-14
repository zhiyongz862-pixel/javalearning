package Demo;

public class AccessingMemberVariables {
    public static void main(String[] args) {
        Zi zil = new Zi();
        zil.show();

    }
    public static class Fu{
        int num = 10;
    }
    public static class Zi extends Fu{
        int num =20;
        public void show(){
            int num = 30;
            // 30局部变量
            System.out.println(num);
            // 当前的对象的num成员变量
            System.out.println(this.num);
            //父类的成员变量
            System.out.println(super.num);

        }
    }
}
